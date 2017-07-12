package tcp;
/**服务器端
 * 1.创建服务器端的端口
 * 2.获取socket
 * 3.发送数据＋接收数据
 * 客户端与服务器端的流要对应
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) throws IOException{
		//1.创建服务器端的端口
		ServerSocket socket = new ServerSocket(8888);
		//2.获取socket,接收客户的链接请求，阻塞式
		Socket server = socket.accept();
		//3.发送数据＋接收数据
		String s="huanyingshiyong";
		
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(server.getOutputStream()));

		wr.write(s);
		
		wr.newLine();
		
		wr.flush();
		
		
		BufferedReader read = new BufferedReader(new InputStreamReader(server.getInputStream()));
		String line;
		StringBuffer stringBuffer = new StringBuffer();
		while((line=read.readLine())!=null){
			
			stringBuffer.append(line);
		}
		
		System.out.println(stringBuffer);
	}

}
