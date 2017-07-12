package inerAddress_inetSocketAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 网络编程
 * 
 * @author user
 *inerAddress类,没有构造方法，只能使用静态的的方法返回结果,没有封装端口。
 * 获得IP和DNS
 *各种方法的使用
 */

public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException{
		
		InetAddress add = InetAddress.getLocalHost();  //返回本机地址
		
		System.out.println(add);
		
		System.out.println(add.getHostAddress());//返回本机地址
		
		System.out.println(add.getHostName()); //返回本机的名字
		
		
		//根据域名获得服务器IP
		add = InetAddress.getByName("home.sise.com");  
		
		System.out.println(add.getHostAddress());
		
		System.out.println(add.getHostName());
		
		
		//根据IP获得域名
		
		add = InetAddress.getByName("68.178.176.152");
		
		System.out.println(add.getHostAddress());

		System.out.println(add.getHostName());
		
		
		
	}
	

}
