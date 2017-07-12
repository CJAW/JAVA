package thread;

public class Demo {

	public static void main(String[] args) {
		
		
		ThreadDemo td = new ThreadDemo();
		ThreadDemo sd = new ThreadDemo();
		td.start();
		sd.start();
		
	}

}
