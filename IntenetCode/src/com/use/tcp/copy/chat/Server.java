package com.use.tcp.copy.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 模仿聊天室
 * @author user
 * 客户端与服务器端的流要对应
 *
 */

public class Server {
	
	private List<MulitServer> list = new ArrayList<MulitServer>();
	
	public static void main(String[] args){
		
		try {
			new Server().conite();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	
	}
	
	
public void conite() throws IOException{
	ServerSocket socket = new ServerSocket(8080);
	Socket server = socket.accept();
		while(true){
		MulitServer mut1 = new MulitServer(server);
		list.add(mut1);
		new Thread(mut1).start();;
		
		}
	
     }

/**
 * 创建多线程服务器端 ,一个客户端一个一个线程
 * @author user
 *
 */

private class MulitServer implements Runnable{   //成员内部类，便于访问私有属性

	private DataInputStream in; //读取客户端发的数据
	private DataOutputStream out;  
	boolean isRunning = true;
	public MulitServer(Socket socket){
		try {
			in = new DataInputStream(socket.getInputStream());
			out = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			
			isRunning = false;
		}
	}
	
	/**
	 * 接收客户端发来信息
	 */
	
	public String receive(){
		String msg = "";
		try {
			
			msg=in.readUTF();
			
		} catch (IOException e) {
			
			isRunning = false;
            list.remove(this);
			//e.printStackTrace();
		}
		return msg;
	}
	
	/**
	 * 服务器发送数据
	 */
	
	public void send(String msg){
		try {
			if(msg!=null&&!msg.equals("")){
			out.writeUTF(msg);
			out.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			isRunning = false;
			list.remove(this);
		}
		
	}
	
	/**
	 * 发送给其它的客户端
	 * 
	 */
	
	private void sendOther(){
		
		String msg =receive();
		Iterator<MulitServer> it = list.iterator();
		while(it.hasNext()){
			MulitServer is = (MulitServer)it.next();
			is.send(msg);
			
		}
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(isRunning){
		sendOther();
		}
	}
	
}

}



