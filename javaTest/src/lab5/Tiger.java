package lab5;

/**
* 项目名称：lab05   
* 类名称：Tiger   
* 类描述：子类Tiger   
* 创建人：谭翔纬 
* 创建时间：2014年10月8日 上午11:01:33   
* 修改人：carxu   
* 修改时间：2014年10月8日 上午11:01:33   
* 修改备注：   
* @version 1.0.0   
*/
public class Tiger extends Animal {
	/*定义Tiger类，继承Animal类，新增属性：战斗力（combat），
	重写父类方法eat()、run()、sleep()和toString()
	*/
	private int combat;
	public int getCombat() {
		return combat;
	}
	public void setCombat(int combat) {
		this.combat = combat;
	}
	/*以及无参构造方法Tiger()
    有参构造方法Tiger(String name,float weight,String food,int combat)*/
	public Tiger(){
	
	}
	public Tiger(String name,float weight,String food,int combat){
		super(name, weight, food);
		this.combat=combat;
	}
	
	@Override
	public void eat() {
		System.out.println(getName()+"正在大口吃肉。。。。。");
	}
	@Override
	public void run() {
		System.out.println(getName()+"跑得飞快。。。。。");
	}
	@Override
	public void sleep() {
		System.out.println(getName()+"眯眼睡觉。。。。。");
	}
	@Override
	public String toString() {
		return super.toString()+"战斗力是："+combat;
	}
	
}
