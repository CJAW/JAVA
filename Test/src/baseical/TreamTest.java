package baseical;

import java.util.Scanner;

public class TreamTest {

	private static Scanner str;
	
	public static void main(String[] args){
		
		str=new Scanner(System.in);
		System.out.println("请输入成绩");
		int m=str.nextInt();
		System.out.println("该生的等级");
		if(m>=90){
			System.out.println("优");
		}else if(m>=80&&m<90){
			System.out.println("良");
		}else if(m>=79&&m<80){
			System.out.println("中");
		}else if(m>=60&&m<70){
			System.out.println("及格");
		}else if(m>=0&&m<60){
			System.out.println("不及格");
		}
		
		
	}
	
	
}
