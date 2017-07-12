//算阶乘


import java.util.Scanner;

public class ForDemo {
 public static Scanner input;
 
	public static void main(String[] args) {
		
	int	result=1;
	
		input = new Scanner(System.in);
		
		System.out.println("请输入数据");
		
		int i=input.nextInt();
		
		for(int n=1;n<=i;n++){
			
		result=result*n;
		
		}
		
		System.out.println(result);
	
	}

}
