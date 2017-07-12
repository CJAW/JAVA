package morearray;

public class MoreArray {
public static void main(String[] args){
	
	// int [][] a={{2,3},{2,5}};
	// System.out.println(a[1][1]);
	
	
	int [][] a=new int[2][];
	a[0]=new int[2];
	a[1]=new int[3];
	
	
	
	a[0][0]=1;
	a[0][1]=2;
	
	
	a[1][0]=5;
	a[1][1]=5;
	a[1][2]=4;

	
	
	
	System.out.println(a[1][0]);
	
	
}
}
