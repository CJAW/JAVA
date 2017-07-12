package wait_synchronized;
/**
 * wait 暂停线程，并释放资源，在那个线程就暂停那个线程
 * 
 * synchronized 同步，可以解决线程的并发问题，（给线程上一把锁，只有先进的对象可以调用资源，其它对象要等待），多个线程访问同一份资源。
 * 
 * 可以是同步块：synchronized(引用类型｜this｜类.class){}要确定好锁位置
 * 
 * 可以是同步方法： public synchronized void xxxx(){}
 * 
 * @author user
 *
 */

public class Demo {

	public static void main(String[] args) {

		Test w = new Test();
		Thread t1 = new Thread(w, "1-->");
		Thread t2 = new Thread(w, "2-->");
		Thread t3 = new Thread(w, "3-->");

		t1.start();
		t2.start();
		t3.start();
	}

}

class Test implements Runnable {

	boolean flg = true;
	@Override
	/*public synchronized void run() {   //同步方法
		while(flg) {
			try {
				Thread.sleep(1000);   //sleep不释放资源
				//this.wait();    //wait释放资源
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			test();
		}
		
	
	}
	*/
	
	public  void run() {   //同步块
		
		synchronized(this){
		while(flg) {
			try {
				//Thread.sleep(1000);   //sleep不释放资源
				this.wait();    //wait释放资源
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			test();
		}
		
	
	}
	}
	public  void test(){     
		for(int i=0;i<10;i++){
			if(i==9){
				flg = false;
			}
			System.out.println(Thread.currentThread().getName()+i);
			
		}
			
		}

}