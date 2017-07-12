package runable;
/**
 * runable 是接口，可以实现多继承，解决了thread的缺点
 * @author user
 * 
 * 1.创建真实的对象
 * 2.使用代理（用thread实现静态代理，因为runable没有start方法，需要使用thread中的start方法）
 * 3.启动线程
 *
 */

public class RunableDemo implements Runnable{

	@Override
	public void run() {
	for(int i=0;i<100;i++){
		System.out.println("打印："+i);
	}
		
	}

}
