package shiyan2;

public class Test {

	public static void main(String[] args){
		
		System.out.println("=====================小学生信息=================");
		System.out.println("学号"+"      "+"姓名"+"       "+"性别"+"         "+"年龄"+"       "+"在读学校");
		User st = new Student(001,"张三",'女',18,"实验中学","");
		System.out.println(st);
		System.out.println("有以下操作：");
		StudentManagerBean s = new StudentManagerBean();
		s.downHomeWork();
		s.updateStudentInfo();
		s.viewCourseTimeTable();
		s.viewExamTime();
		s.viewHomeWork();
		s.viewScore();
		
		System.out.println("=====================大学生信息=================");
		System.out.println("学号"+"      "+"姓名"+"       "+"性别"+"         "+"年龄"+"       "+"在读学校"+"        "+"系"+"        "+"专业");
		CollegeStudent cs = new CollegeStudent(002,"李四",'男',18,"华南师范","软件","软件开发","");
		System.out.println(cs);
		System.out.println("有以下操作：");
		CollegeStudentManagerBean d = new CollegeStudentManagerBean();
		d.downHomeWork();
		d.updateStudentInfo();
		d.viewCourseTimeTable();
		d.viewExamTime();
		d.viewHomeWork();
		d.viewScore();
		d.addPractise();
		d.addPractiseInfo();
		d.selectCourse();
		d.updatePractiseInfo();
		
		
		
		
		System.out.println("=====================研究生学生信息=================");
		System.out.println("学号"+"      "+"姓名"+"       "+"性别"+"         "+"年龄"+"       "+"在读学校"+"        "+"系"+"        "+"专业"+"          "+"导师姓名");
		CollegeStudent gs = new CollegeStudent(003,"王五",'男',29,"华南师范","软件","软件开发","赵六");
		System.out.println(gs);
		System.out.println("有以下操作：");
		GraduateStudentManagerBean g = new GraduateStudentManagerBean();
		g.downHomeWork();
		g.updateStudentInfo();
		g.viewCourseTimeTable();
		g.viewExamTime();
		g.viewHomeWork();
		g.viewScore();
		g.addPractise();
		g.addPractiseInfo();
		g.selectCourse();
		g.updatePractiseInfo();
		g.addPaperInfo();
		g.addPractise();
		g.addPractiseInfo();
		g.selectTutor();
		g.updatePaperInfo();
		
		
		System.out.println("=====================中小学老师生信息=================");
		System.out.println("公号"+"      "+"姓名"+"     "+"性别"+"       "+"年龄"+"       "+"职称"+"           "+"学校"+"      "+"专业"+"      "+"教研室所");
		Teacher ts = new Teacher(003,"钱七",'男',31,"中学一级教师","实验中学","语言","语文教研所","");
		System.out.println(ts);
		System.out.println("有以下操作：");
		TeacherManagerBean t = new TeacherManagerBean();
		t.issueHmoeWork();
		t.registerAttendance();
		t.updateAttendance("1号学生");
		t.updateTeacherInfo();
		t.registerScore("几何");
		
		
		System.out.println("=====================大学老师生信息=================");
		System.out.println("公号"+"      "+"姓名"+"       "+"性别"+"     "+"年龄"+"       "+"职称"+"        "+"学校"+"        "+"专业"+"          "+"所在院系");
		Teacher ct = new Teacher(003,"孙八",'男',38,"副教授","中山中学","人工智能","软件学院","");
		System.out.println(ct);
		System.out.println("有以下操作：");
		CollegeTeacherManagerBean z = new CollegeTeacherManagerBean();
		z.issueHmoeWork();
		z.registerAttendance();
		z.updateAttendance("1号");
		z.updateTeacherInfo();
		z.guideGraduationDesgin();
		z.guidepracties();
		z.registerScore("软件工程");
		
	}
	
}
