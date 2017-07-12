package lab5;

/**
* 项目名称：lab05   
* 类名称：Animal   
* 类描述：父类Animal   
* 创建人：谭翔纬 
* 创建时间：2014年10月8日 上午10:47:59   
* 修改人：carxu   
* 修改时间：2014年10月8日 上午10:47:59   
* 修改备注：   
* @version 1.0.0   
*/
public class Animal {
/*	定义Animal类，包括属性：名称（name）、体重（weight）、主食（food）；
       方法eat()、run()、sleep()和toString()以及
	无参构造方法Animal()和
	有参构造方法Animal(String name,float weight,String food)。*/
	private String name;
	private float weight;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public String getFood() {
		return food;
	}
	
	public void setFood(String food) {
		this.food = food;
	}
	
	private String food;
	//构造方法
	public Animal(){
		
	}
	
	public Animal(String name,float weight,String food){
		this.name=name;
		this.food=food;
		this.weight=weight;
	}
	
	//自定义成员方法
	public void eat() {
		System.out.println("动物可以吃东西。。。。");
	}
	
	public void run() {
		System.out.println("动物可以吃奔跑。。。。");
	}
	
	public void sleep() {
		System.out.println("动物可以睡觉。。。。");
	}
	
	//方法覆盖
	@Override
	public String toString() {
		return  "动物"+name+",体重是"+weight+"公斤,"+"所吃食物是："+food+"  ";
	}
	
}
