package shiyan2;

public class CollegeStudentManagerBean extends AbstractCollegeStudentManager{

	@Override
	public void printMsg() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student getStudentById(int uid) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addPractiseInfo(){
		
		System.out.println("添加实习信息");

	}
	
public void updatePractiseInfo(){
	System.out.println("修改实习信息");

	}

public void selectCourse(){
	
	System.out.println("自主选课");

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

}
