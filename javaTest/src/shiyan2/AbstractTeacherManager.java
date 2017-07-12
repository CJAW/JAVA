package shiyan2;

public abstract class AbstractTeacherManager {
	
	public void issueHmoeWork(){
		
	}

	public void registerAttendance(){
		
	}

	public void updateAttendance(String sno){
		
	}
	
	public String queryAttendanceByStudent(int sid){
		return null;
		
	}
	public void updateTeacherInfo(){
		
	}

	public void printTeacherInfo(int id){
		
	}

	abstract public void printMsg();
	
	abstract public Teacher getTeacherById(int id);

}
