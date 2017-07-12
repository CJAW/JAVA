package InterfaceTest;


public interface InterfaceTest {

	public void add();
}


 class  test1 implements InterfaceTest{

	public void add() {
		
		System.out.println("jiafa");
	}

	public static void main(String[] args){
		
		test1 a=new test1();
		
		a.add();
		
	}
}