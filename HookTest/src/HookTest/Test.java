package HookTest;

public class Test {
	
	public static void printdraw(Hook p){
		
		System.out.println("输出信息0");
		
		System.out.println("输出信息1");
																			
		System.out.println("输出信息2");	
		
		p.print();
	}
	
	public static void main(String[] args){
		
     printdraw(new Test02());
     
	}


}



class Test1 extends Hook{
	
	public void print(){
		
		System.out.println("输出信息5");
		
	}
}



class Test02 extends Hook{
	
	public void print(){
		System.out.println("输出信息6");
	}
}