package di_gui;

import java.util.Scanner;

/**
 * 递归
 * 汉诺塔问题
 * @author user
 *
 */
public class DiGui {

	private static Scanner str;
	
	public static void main(String[] args){
		
		str = new Scanner(System.in);
		System.out.println("请输入成数：");
		int n=str.nextInt();
		char x='x';
		char y='y';
		char z='z';
		move(n,x,y,z);
		
		
	}
	
	public static void move(int n,char x,char y ,char z){
		if(n==1){
			System.out.println(x+"--->"+z);  //将x轴上的饼移动到z轴上
			
		}else{
			move(n-1,x,z,y); //从x轴借助z轴移动到y轴
			System.out.println(x+"--->"+z);
			move(n-1,y,x,z);//从y轴借助x轴移动到z轴
			
		}
		
	}
	
}
