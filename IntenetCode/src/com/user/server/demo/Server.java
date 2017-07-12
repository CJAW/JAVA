package com.user.server.demo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {
	
	private Socket client;
	private ServerSocket server;
	private static final String blank=" ";
	private static final String enter="\r\n";
	
	public  static void main(String[] args){
		
		Server server = new Server();
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
			
			//服务器响应
		StringBuilder contextRespond = new StringBuilder();
		StringBuilder respond = new StringBuilder();
		
		//响应的文件
		contextRespond.append("<Html><Head><title>测试</title>;"+"</Head><body>hell word</body></Html>");
		//响应的协议
		respond.append("HTTP/1.0").append(blank).append("200").append(blank).append("OK").append(enter);
		//响应头
		respond.append("Server:hello Server/0.0.1").append(enter);
		
		respond.append("Date:").append(new Date()).append(enter);
		
		respond.append("Content_Type:text/html;setchar=GBK").append(enter);
		
		respond.append("context-Length:").append(contextRespond.toString().getBytes().length).append(enter);
		
		respond.append(enter);
		//正文
		respond.append(contextRespond);
		
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
		
		bw.write(respond.toString());
		bw.flush();
		bw.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		
	}

}
