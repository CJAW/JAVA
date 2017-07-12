package tree_set;

public class Person {
	
	private String name;
	private int money;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Person() {
		
	
	}
	public Person(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	
	
  public String toString(){
	  
	  return "姓名："+this.name+"钱："+this.money+"\n";
  }
}
