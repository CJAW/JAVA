package lab5;

/**
* 项目名称：lab05   
* 类名称：AnimalTest   
* 类描述：测试类   
* 创建人：谭翔纬 
* 创建时间：2014年10月8日 上午11:11:09   
* 修改人：carxu   
* 修改时间：2014年10月8日 上午11:11:09   
* 修改备注：   
* @version 1.0.0   
*/
public class AnimalTest {

	public static void main(String[] args) {
		Animal animal=new Animal("人",80.0f,"海鲜");
		animal.eat();
		animal.run();
		animal.sleep();
		System.out.println(animal.toString());
		System.out.println("===========================================");
		Tiger tiger=new Tiger("老虎",200,"肉",1000);
		tiger.eat();
		tiger.run();
		tiger.sleep();
		System.out.println(tiger.toString());
		System.out.println("===========================================");
		Bull bull=new Bull("公牛", 500, "草", 500);
		bull.eat();
		bull.run();
		bull.sleep();
		System.out.println(bull.toString());
	}

}
