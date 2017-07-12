import java.util.Scanner;

public class InputDemo {
private static Scanner str;

public static double Square(double width,double longeth){
		
		return width*longeth;
		
	}
	
	public static double Cy(double width,double longth){
		
		return 2*(width+longth);
	}

	public static void main(String[] args) {
		
			str = new Scanner(System.in);
			
			System.out.println("输入数据：");
			
			double m=str.nextDouble();
			
			double n=str.nextDouble();
			
		    double s=Square(m,n);
		
		    System.out.println("面积:"+s);
		
		    double c= Cy(m,n);
		
		    System.out.println("周长:"+c);
		

	}


}
