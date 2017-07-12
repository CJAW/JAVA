package internet_prtile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InternetPrtile {
	
	public static void main(String[] args) throws UnsupportedEncodingException, IOException{
		
		
	URL url = new URL("http://www.baidu.com:80");
			
	BufferedReader in= new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));
	
	//BufferedWriter ot = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/Users/user/Desktop/PHP/index.txt"),"Utf-8"));
	
	String msg =""; //接收容器
	
    msg=in.readLine();
	
    //System.out.println(msg);
    
	Pattern p =Pattern.compile("<a\\s.*?href=\"([^\"]+)\"[^>]*>(.*?)</a>"); //创建正则表达式
	
	Matcher m = p.matcher(msg);  //匹配msg内容
	
	while(m.find()){
		
		System.out.print(m.group());
		
	}
	
	
	/*while(null!=(msg=in.readLine())){   //读取
		ot.write(msg);
		ot.newLine();
		ot.flush();
	}
	
		
		ot.close();
		in.close();
	*/
	}
}
