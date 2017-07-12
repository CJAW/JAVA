package udp;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * 客户端
 * @author user
 *
 * 1.创建端口,(不要冲突)
 * 2.准备发送的信息
 * 3.打包数据
 * 4.发送数据
 * 5.关闭
 */

public class UdpDemo01 {

	public static void main(String[] args) throws IOException{
		//1.创建端口,(不要冲突)
		DatagramSocket client = new DatagramSocket(4444);
		//2.准备发送的信息
		double msg = 1223.2332;
		byte[] data =convents(msg);
		//3.打包数据
		DatagramPacket pack=new DatagramPacket(data, data.length,new InetSocketAddress("localhost",8888));
		 //4.发送数据
		client.send(pack);
		//5.关闭
		client.close();
		
	}
	
	/**
	 * 将double的数组转换成字节数组
	 * @param math
	 * @return
	 * @throws IOException
	 */
	
	public static byte[] convents(double math) throws IOException{
		
		byte[] data =null;//接收信息的容器
		
		ByteArrayOutputStream dos=new ByteArrayOutputStream();//有新增方法不能使用多肽
		
		DataOutputStream out = new DataOutputStream(dos);  //可以输出各类的数据流
		
		
		out.writeDouble(math);
		
		data = dos.toByteArray();
		
		out.flush();
		out.close();
		
		
		return data;
	}
}
