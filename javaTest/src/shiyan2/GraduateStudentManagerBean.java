package shiyan2;

public class GraduateStudentManagerBean extends CollegeStudentManagerBean implements GraduateStudentManager{

	@Override
	public void selectTutor() {
		// TODO Auto-generated method stub
		System.out.println("自主选择导师");

	}

	@Override
	public void updatePaperInfo() {
		// TODO Auto-generated method stub
		System.out.println("更新个人发表");

	}

	@Override
	public void addPaperInfo() {
		System.out.println("添加个人论文发表");

		// TODO Auto-generated method stub
		
	}
	
	public void printMsg(){
		
	}
	
	public Student getStudentById(int sid){
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
