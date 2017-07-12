package Test;
/**
 * 多肽
 * @author user
 *
 */
public class Student {
	
	private int id;
	private String name;
	private String sex;
	private int age;
	
	
	public void SetId(){
		System.out.println("shuru");
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	}



class Teacher extends Student{
	
	public void nummber(){
		
		System.out.println("number is");
		
	}
	
	public void SetId(){
		System.out.println("teacher number");
	}
	
}
