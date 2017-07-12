package com.user.server.demo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server2 {
	
	private Socket client;
	private ServerSocket server;
	private static final String blank=" ";
	private static final String enter="\r\n";
	
	public  static void main(String[] args){
		
		Server2 server = new Server2();
		server.start();
		
	}
	/**
	 * 启动服务器
	 */
	
	public void start(){
		
		try {
		server = new ServerSocket(8888);
		this.receiver();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}
	
	/**
	 * 接收客户端的信息
	 * @throws IOException 
	 */
	
	public void receiver() throws IOException{
		try {
			//获取信道
			client = server.accept();
			//接收容器
			String msg;
			//接收信息
			byte[] flush = new byte[2048];
			
			int len = client.getInputStream().read(flush);
			
			msg=new String(flush,0,len).trim();
			
			System.out.println(msg);
	
		Respond re=new Respond(client.getOutputStream());
		re.print("<Html><Head><title>测试</title>");
		re.println("</Head><body>hell word</body></Html>");
		re.sendClient(200);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		
	}

}
