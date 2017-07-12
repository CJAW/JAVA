package com.use.tcp.copy.chat;


import java.io.DataInputStream;

import java.io.IOException;

import java.net.Socket;

/**
 * 封装客户端接收服务器发送的消息
 * @author user
 *客户端与服务器端的流要对应
 */
public class Receive implements Runnable {

    private  boolean isRunning = true;
    
    private DataInputStream data;
    
    public Receive(){
    	
    }
	
 public Receive(Socket client) throws IOException{
	 this();
    data =new DataInputStream(client.getInputStream());
    }
	
 /**
  * 接收服务器数据
 * @throws IOException 
  */
 public String receive() throws IOException{
	 String msg = "";
	 try {
		 msg =data.readUTF();
		 
	   System.out.println(msg);
	   
	} catch (IOException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		
		data.close();
		isRunning = false;
	}
		return msg;
 }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(isRunning){
			try {
				
				System.out.println(receive());
			} catch (IOException  e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
	}
	

}


