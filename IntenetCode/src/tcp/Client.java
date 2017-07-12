package tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 在tcp中 效率低，但安全
 * 服务器与客户端用一个通道
 * @author user
 *
 *客户端：
 *1.创建端口
 *2.发送数据＋接收数据
 *
 *客户端与服务器端的流要对应
 */

public class Client {
	
	public static void main(String[] args) throws UnknownHostException, IOException{
		//1.创建端口
		Socket client =new Socket("localhost", 8888);
		//2.发送数据＋接收数据
		BufferedReader re = new BufferedReader(new InputStreamReader(client.getInputStream()));
		
		System.out.println(re.readLine());
		
		re.close();
		
		client.close();
		
	}

}
