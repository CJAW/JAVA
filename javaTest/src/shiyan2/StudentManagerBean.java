package shiyan2;

public class StudentManagerBean extends AbstractStudentManager {
	
	 public void printMsg(){
		 
	 }
	   
	@Override
	public Student getStudentById(int uid) {
		
		return null;
	}

	public String viewExamTime() {
		
		String s = "查看考试时间";
		System.out.println(s);
		return null;

	}
	
	public String viewCourseTimeTable() {
		String s = "查看课表";
		System.out.println(s);
		return null ;
	}
	
	public String viewScore() {
		String s = "查看成绩";
		System.out.println(s);
		return null;

	}
	
	public String viewHomeWork() {
		String s = "查看作业";
		System.out.println(s);
		return null;

	}

	public void downHomeWork(){
		
		System.out.println("下载作业");
	}

   public void updateStudentInfo(){
	   
	   System.out.println("更新个人信息");
		
	}
   public void printStudentInfo(int id){
		
	}
   
}
