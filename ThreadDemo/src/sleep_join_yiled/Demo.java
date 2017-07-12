package sleep_join_yiled;
/**
 * sleep 休眠线程，但不释放资源，在那个线程就休眠那个线程。
 * join 合并线程，但会阻塞线程，在那个线程就合并那个线程
 * yield 停止线程，在那个线程就停止那个线程
 * @author user
 *
 */

 class Test implements Runnable {

	@Override
	public void run() {
	
		for(int i=0;i<10;i++){
			System.out.println("xxx");
			
			try {
				Thread.sleep(2000);
				//new Thread().join();
				//new Thread().yield();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

 public class Demo{
	
	public static void main(String[] args){
		
		Test t = new Test();
		Thread p1 = new Thread(t);
		p1.start();
		
		
	}
}
