package shiyan;

public class Cat extends Aminal implements Terrestrial{

	private int letNum;
     
	public Cat(String name,int letNum,String sound) {
		super(name,sound);
		this.letNum = letNum;
		
		}
	
	public int getLetNum() {
		return letNum;
	}


	public void setLetNum(int letNum) {
		this.letNum = letNum;
	}

	public void shout(){
		System.out.println(getName()+"           "+getLetNum()+"        "+getSound());
		
	}
	
}


