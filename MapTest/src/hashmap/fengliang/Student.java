package hashmap.fengliang;

/**
 * 
 * hashMap的分练存储，（一对多思想）
 *
 */

public class Student {
	
	private String name;
	private double score;
	private String  classnum;
	
	public Student(){
		
	}

	public Student(String name,double score,String classnum){
		
		this.name=name;
		this.score=score;
		this.classnum=classnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getClassnum() {
		return classnum;
	}

	public void setClassnum(String classnum) {
		this.classnum = classnum;
	}
	
	
	
}
