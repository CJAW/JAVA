package weak.strong.soft.list.map;


import java.lang.ref.WeakReference;

/**
 *xxxReference的使用：
 * 强引用时，不会被回收。
 * 软引用时，当内存不足时会被回收
 * 弱引用时，会被回收。
 * 
 * 在常量池中的对象，会被共享，因此不会被回收,在堆中的会被回收（即new对象）。
 * @author user
 *
 */

public class WSSDemo {

	public static void main(String[] args) {

		String s = new String("eda");
		//String s = "eda";//在常量池中不会被回收
     
		WeakReference str = new WeakReference(s);
		
		System.out.println("回收前：" + str.get());
		
	    s=null;

		System.gc();

		System.runFinalization();

		System.out.println("回收后：" + str.get());

	}

}
