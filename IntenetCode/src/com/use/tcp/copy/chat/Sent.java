package com.use.tcp.copy.chat;
/**
 * 封装客户端的发送信息。
 * 客户端与服务器端的流要对应
 */

import java.io.BufferedReader;

import java.io.DataOutputStream;
import java.io.IOException;

import java.io.InputStreamReader;

import java.net.Socket;


public class Sent implements Runnable{

	boolean isRunning = true;
	private BufferedReader console;
	private DataOutputStream socket;
	
	public  Sent() throws IOException {
			console =  new BufferedReader(new InputStreamReader(System.in));
	}
	
	public Sent(Socket client) throws IOException{

		    this();
			try {
				socket = new DataOutputStream(client.getOutputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				socket.close();
				isRunning = false;
			}
			
	}
	/**
	 * 读取控制台信息
	 * @return
	 * @throws IOException
	 */
	public String consoleSend() throws IOException{
		try {
			return console.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			console.close();
			isRunning=false;
			return "";
		}
		
		 
	}
	
	/**
	 * 发送控制台的数据到服务器
	 * @throws IOException
	 */
	public void Send() throws IOException{
		
		try {
			
			String msg=consoleSend();
			if(msg!=null&&!msg.equals("")){
			socket.writeUTF(msg);;
			socket.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			socket.close();
			isRunning =false;
		}
		
	}
	@Override
	public void run() {
		
		while(isRunning){
			try {			
				Send();
			} catch (IOException  e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
		
	}

	

}
