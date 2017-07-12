package datatest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTest {
	
	public static void main(String[] args) throws ParseException{
		
		//将数字转换为字符串的格式时间
		Date a =new Date(1233214123);
		
		DateFormat y= new SimpleDateFormat("yyyy年m月d日");
		
		String str=y.format(a);
		
		System.out.println(str);
		
		
		
		//将字符串转换为固定格式
		String str1="1990-2-4";
		
		DateFormat d= new SimpleDateFormat("yyyy-m-d");
		
		Date s=d.parse(str1);  //解析字符串
		
		System.out.println(s);
		
	}

}
