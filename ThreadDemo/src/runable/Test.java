package runable;

public class Test {

	public static void main(String[] args){
		// 1.创建真实的对象
	RunableDemo t = new RunableDemo();
	
	    //* 2.使用代理（用thread实现静态代理，因为runable没有start方法，需要使用thread中的start方法）
	Thread t1 = new Thread(t);
	Thread t2 = new Thread(t);
	Thread t3 = new Thread(t);
	   // * 3.启动线程
	t1.start();
	t2.start();
	t3.start();
		
	}
	
}
