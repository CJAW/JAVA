package datatest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestViewCalendar {
	
	public static Scanner str;

	public static void main(String[] args) throws ParseException{
		
		str = new Scanner(System.in);
		
		System.out.println("请按照格式输入日期：yyyy-mm-dd");
		
		String dateStr=str.nextLine();
		
		String temp=dateStr;
		
		DateFormat format=new SimpleDateFormat("yyyy-mm-dd");
		
			Date date = format.parse(temp);
			
			Calendar calendar=new GregorianCalendar();
			
			calendar.setTime(date);
			
			int today = calendar.get(Calendar.DATE);
			
			calendar.set(Calendar.DATE,1);
			
		   int dateMax = calendar.getActualMaximum(Calendar.DATE);
		   
		System.out.println("日\t"+"一\t"+"二\t"+"三\t"+"四\t"+"五\t"+"六\t");
		
		for(int n=0;n<calendar.get(Calendar.DAY_OF_WEEK)-1;n++){
			   
			   System.out.print("\t");
		   }
	
		for(int n=1;n<=dateMax;n++){
			
			if(n==today){
				
				System.out.print("*");
				
			}
			
			System.out.print(n+"\t");
			
			int d = calendar.get(Calendar.DAY_OF_WEEK);
			
			if(d==Calendar.SATURDAY){
				
				System.out.println();
			}
			calendar.add(Calendar.DATE, 1);
		}
		
	}
}
