package com.use.tcp.copy.chat;


import java.io.IOException;

import java.net.Socket;
import java.net.UnknownHostException;


public class Client{

	public static void main(String[] args) throws UnknownHostException, IOException{
		
		Socket client = new Socket("localhost",8080);
		
		new Thread(new Sent(client)).start();
		new Thread(new Receive(client)).start();
		
		
	}

	
	
}
