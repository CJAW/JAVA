package shiyan2;

public class CollegeStudent extends Student {

	private String dept;
	private String majoy;
	public CollegeStudent(int id, String name, char gender,int age, String school, String sno, String dept,
			String majoy) {
		super(id, name,  gender,age, school, sno);
		this.dept = dept;
		this.majoy = majoy;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getMajoy() {
		return majoy;
	}
	public void setMajoy(String majoy) {
		this.majoy = majoy;
	}
	
	public String toString(){
    	return this.getId()+"           "+this.getName()+"        " +this.getGender()+"       " + this.getAge()+"         " + getSchool() +"        "+ getSno()+"        "+this.dept+"        "+this.majoy;

	}
}
