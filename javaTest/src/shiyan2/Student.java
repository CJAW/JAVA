package shiyan2;

public class Student extends User {

	private String school;
	private String sno;
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public Student(int id, String name,char gender,int age,String school, String sno) {
		super(id, name,gender,age );
		this.school = school;
		this.sno = sno;
	}
	
    public String toString(){
    	return this.getId()+"           "+this.getName()+"        " +this.getGender()+"       " + this.getAge()+"         " + this.school +"        "+ this.sno;
    }
}
