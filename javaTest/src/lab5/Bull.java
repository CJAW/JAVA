package lab5;

public class Bull extends Animal {
	/*定义Bull类，继承Animal类，新增属性：战斗力（combat），
	重写父类方法eat()、run()、sleep()和toString()
	*/
	private int strength;
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	/*以及无参构造方法Bull()
    有参构造方法Bull(String name,float weight,String food,int strength)*/
	public Bull(){
		super();
		
	}
	public Bull(String name,float weight,String food,int strength){
		super(name, weight, food);
		this.strength=strength;
	}
	
	@Override
	public void eat() {
		System.out.println(getName()+"正在悠然吃草。。。。。");
	}
	@Override
	public void run() {
		System.out.println(getName()+"正在加速奔跑。。。。。");
	}
	@Override
	public void sleep() {
		System.out.println(getName()+"惬意地睡觉。。。。。");
	}
	@Override
	public String toString() {
		return super.toString()+"力气值是："+strength;
	}
}
