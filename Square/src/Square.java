
public class Square {
	
	public static double square(double width, double longeth){
		
		return width*longeth;
		
	}
	
	public static double Cy(double width,double longth){
		
		return 2*(width+longth);
	}

	public static void main(String[] args) {
		
		double s=square(2.0,4.0);
		
		System.out.println("面积:"+s);
		
		double c= Cy(3,4);
		
		System.out.println("周长:"+c);
		

	}
	

}
