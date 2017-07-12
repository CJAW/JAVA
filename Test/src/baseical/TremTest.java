package baseical;

import java.util.Scanner;

public class TremTest {
	
	private static Scanner sc;
	public static void main(String[] args){
		
		int n8=0;
		int n7=0;
		int n6=0;
		int n5=0;
		int n=0;
		int score=0;
		sc=new Scanner(System.in);
		
	do{
		System.out.println("输入成绩"); 
		score=sc.nextInt();	
		if(score>=90&&score<=100) n8++;
		else if(score>=80&&score<90) n7++;
		else if(score>=70&&score<80) n6++;
		else if(score>=60&&score<70) n5++;
		else if(score>=0&&score<60) n++;	
	}while(score>=0);
	
	sc.close();
		System.out.println("成绩在90-100的人数："+n8);
		System.out.println("成绩在80-90的人数："+n7);
		System.out.println("成绩在70-80的人数："+n6);
		System.out.println("成绩在60-70的人数："+n5);
		System.out.println("成绩在0-60的人数："+n);
	}

}
