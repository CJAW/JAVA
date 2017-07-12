package shiyan2;

public class Teacher extends User {

	private String wno;
	private String school;
	private String title;
	private String dept;
	private String majoy;
	public Teacher(int id, String name, char gender,int age, String wno, String school, String title, String dept,
			String majoy) {
		super(id, name, gender,age);
		this.wno = wno;
		this.school = school;
		this.title = title;
		this.dept = dept;
		this.majoy = majoy;
	}
	public String getWno() {
		return wno;
	}
	public void setWno(String wno) {
		this.wno = wno;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getMajor() {
		return majoy;
	}
	public void setMajor(String major) {
		this.majoy = major;
	}
	
	public String toString(){
    	return this.getId()+"         "+this.getName()+"      " +this.getGender()+"       " + this.getAge() +"        "+this.wno+"      "+getSchool()+"      "+this.title +"        "+this.dept+"      "+this.majoy;

	}
	
	
}
