package matrix;

public class Mattri {
	
	//打印数组
	public static void print(int [][] c){
		
            for(int i=0;i<c.length;i++){
            	
			for(int j=0;j<c.length;j++){
				
			System.out.print(c[i][j]+"   ");
			
			}
			System.out.println();
		}
	
		
	}
	
	
	//数组相加
	
	public static int[][]  add(int[][]a,int[][]b){
		
		int [][] c=new int[a.length][a.length];
		
	      for(int i=0;i<c.length;i++){
			
			for(int j=0;j<c.length;j++){
				
				c[i][j]=a[i][j]+b[i][j];
			}
			
		}
		return c;
	}
	
	
	
	public static void main(String[] args){
		
		int [][] a={{1,2},{1,3}};
		
		int [][] b={{1,5},{1,6}};
		
		int[][] c=  add(a,b);
		print(c);
		
	
	}
	
	

}
