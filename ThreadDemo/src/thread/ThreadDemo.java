package thread;
/**
 * 使用thread实现多线程
 * 
 * 只能单一继承(即如果类已经继承了一个类，这不能在继承thread类
 * @author user
 *
 */

public class ThreadDemo extends Thread {
	
	public void run(){
		for(int i= 0 ;i<100;i++){
			
			
			System.out.println("打印："+i);
		}
		
	}
	

}
