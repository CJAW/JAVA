package shiyan;

public class Test {
	
	public static void main(String[] args){
		
		Duck duck = new Duck("鸭子",2,"gaga");
		Dolphin dolphin = new Dolphin("海豚",0,"mmm");
		Cat cat = new Cat("猫",4,"miaomiao");
		
		
	System.out.println("动物名字"+"     "+"腿数"+"        "+"声音");
	
	Aminal[] anim = new Aminal[3];
	anim[0] = duck;
	anim[1] = dolphin;
	anim[2] = cat;
	
	
	
	for(int i=0;i<3;i++){
		
		anim[i].shout();
	}
	}

}
