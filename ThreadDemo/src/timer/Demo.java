package timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 任务的调度
 * Timer类的schedule方法
 * @author user
 *
 */

public class Demo {

	public static void main(String[] args){
		
		Timer t = new Timer();
		
	t.schedule(new TimerTask(){

		@Override
		public void run() {
		System.out.println("sdad");
			
		}
		
	}, new Date(System.currentTimeMillis()+1000) ,200);
		
	}
}
