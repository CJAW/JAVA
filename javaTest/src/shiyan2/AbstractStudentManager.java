package shiyan2;

public abstract class AbstractStudentManager {
	
	public String viewExamTime() {
		return null;

	}
	
	public String viewCourseTimeTable() {
		return null;

	}
	
	public String viewScore() {
		return null;

	}
	
	public String viewHomeWork() {
		return null;

	}

	public void downHomeWork(){
		
	}

   public void updateStudentInfo(){
		
	}
   public void printStudentInfo(int id){
		
	}
   
   abstract public void printMsg();
   
   abstract public Student getStudentById(int uid);

}
