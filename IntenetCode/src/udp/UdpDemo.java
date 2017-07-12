package udp;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 效率高，但不安全 ，非面向链接，数据可能丢失。
 * 
 * 服务器端：
 * 1.创建端口,(不要冲突)
 * 2.准备接收容器
 * 3.打包数据
 * 4.接收数据
 * 5.分析数据
 * 6.关闭
 * @author user
 *
 */

public class UdpDemo {

	
	public static void main(String[] args) throws IOException{
		
		//1.创建端口,(不要冲突)
		DatagramSocket server = new DatagramSocket(8888);
		// 2.准备接收容器
		byte[] len = new byte[1024];
		//打包数据
		DatagramPacket data = new DatagramPacket(len,len.length);
		//接收数据
		server.receive(data);
	    //分析数据
	    double msg =change(data.getData());
	    
		System.out.println(msg);
		//.关闭
		server.close();
		
	}
	/**
	 * 将字节数组转换为double数组
	 * @param math
	 * @return
	 * @throws IOException
	 */
	public static double change(byte[] math) throws IOException{
		
		
		DataInputStream in = new DataInputStream(new ByteArrayInputStream(math));
		
		double data =in.readDouble();
		in.close();
		
		return data;
		
	}
}
