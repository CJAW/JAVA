package shiyan2;

public class CollegeTeacherManagerBean extends AbstractTeacherManager{

	@Override
	public void printMsg() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Teacher getTeacherById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void issueHmoeWork(){
		System.out.println("发布作业");
	}

	public void registerAttendance(){
		System.out.println("登记学生考勤");
	}

	public void updateAttendance(String sno){
		System.out.println("修改"+sno+"学生的考勤");
	}
	
	public String queryAttendanceByStudent(int sid){
		return null;
		
	}
	public void updateTeacherInfo(){
		System.out.println("更新本人资料");
		
	}
	
	public void guidepracties(){
		System.out.println("指导学生学习");
		
	}
	public void guideGraduationDesgin(){
		System.out.println("指导学生毕业设计");
		
	}
	
	public void registerScore(String score){
		
		
			System.out.println("登记"+score+"成绩");
			
	
		
	}

}
