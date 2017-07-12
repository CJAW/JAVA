package lable3;
public class BookTest extends Book {
	public static void main(String[] args){
	Book bk1 =  new Book();
		bk1.setBookname("java核心编程");
		bk1.setName("张起");
		bk1.setNum("110-110-152-151");
		bk1.setPrice(45);
		bk1.setProduct("大连出版社");
	
	System.out.println("书名："+bk1.getBookname());
	System.out.println("作者："+bk1.getName());
	System.out.println("ISN码："+bk1.getNum());
	System.out.println("价格："+bk1.getPrice());
	System.out.println("出版社："+bk1.getProduct());
	}
}
