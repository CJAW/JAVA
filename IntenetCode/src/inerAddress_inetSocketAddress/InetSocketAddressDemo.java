package inerAddress_inetSocketAddress;

import java.net.InetAddress;
import java.net.InetSocketAddress;

/**
 * inetSocketAddress类在inerAddress扩展了端口，还实现了构造方法。
 * @author user
 *
 */

public class InetSocketAddressDemo {
	
	
	public static void main(String[] args){
		
		InetSocketAddress add = new InetSocketAddress("172.16.168.3",4444);
		
		System.out.println(add.getHostName());
		System.out.println(add.getPort());
		
		
		InetAddress addr = add.getAddress();
		System.out.println(addr.getHostAddress());
		
	}

}
