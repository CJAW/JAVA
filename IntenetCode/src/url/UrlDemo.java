package url;
/**
 * URL支持固定的地址
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

public class UrlDemo {

	public static void main(String[] args) throws IOException{
		
		
		URL url=new URL("http://www.baidu.com:80");
		
		
		BufferedReader in= new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));
		
		BufferedWriter doc = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/Users/user/Desktop/PHP/index.html"),"Utf-8"));
		
		
		String msg= null;  //接收字符串
		
		while(null!=(msg=in.readLine())){
			doc.write(msg);
			
		}
		doc.flush();
		doc.close();
		in.close();
	}
}
