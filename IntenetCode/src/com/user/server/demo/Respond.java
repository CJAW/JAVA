package com.user.server.demo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Date;

/**
 * 封装respond
 * @author user
 *
 */

public class Respond {

	private static final String blank=" ";
	private static final String enter="\r\n";
	private static BufferedWriter bw;
	StringBuilder headInfo;
	StringBuilder context;
	
	private int len=0;
	
	public Respond(){
		headInfo = new StringBuilder();
		context = new StringBuilder();
		len=0;
	}
	
	public Respond(OutputStream os){
		this();
		bw =new BufferedWriter(new OutputStreamWriter(os));
	}
	/**
	 * 构建正文
	 * 
	 * 流模式
	 */
	
    public	Respond print(String info){
    	context.append(info);
    	len+=info.getBytes().length;
    	return this;
    
    }
	
	/**
	 * 构建正文+回车
	 * 流模式
	 */
	
    public  Respond println(String info){
    	
    	context.append(info).append(enter);
    	len+=(info+enter).getBytes().length;
    	return this;
    }
    
	/**
	 * 响应头
	 */
	private void respondHead(int code){

		headInfo.append("HTTP/1.0").append(blank).append(code).append(blank);
		switch(code){
		case 200: headInfo.append("OK");
		break;
		case 404: headInfo.append("NOT FOUND");
		break;
		case 505:headInfo.append("SERVER ERROR");
		break;
		}
		
		headInfo.append(enter);
		
		headInfo.append("Server:hello Server/0.0.1").append(enter);
		
		headInfo.append("Date:").append(new Date()).append(enter);
		
		headInfo.append("Content_Type:text/html;setchar=GBK").append(enter);
		
		headInfo.append("context-Length:").append(len).append(enter);
		
		headInfo.append(enter);
	}
	
	/**
	 * 发送服务器信息给客户端
	 * @throws IOException 
	 */
	
	public void sendClient(int code) throws IOException{
		
		respondHead(code);
		bw.write(headInfo.toString());
		bw.write(context.toString());
		bw.flush();
		bw.close();
		
	}
	
}
