package hashmap.fengliang;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
	
	private double total;
	private List <Student>stud;
	private int classno;
	
	public ClassRoom(){
		stud = new ArrayList<Student>();
		
	}
public ClassRoom(int classno){
		
	this();
	this.classno = classno;
	}
   public ClassRoom(double total,List<Student> stud,int classno){
	   
	   this.total=total;
	   this.stud=stud;
	   this.classno=classno;
	
		
	}
   
   
   
   public double getTotal() {
	return total;
}

public void setTotal(double total) {
	this.total = total;
}

public List<Student> getStud() {
	return stud;
}

public void setStud(List<Student> stud) {
	this.stud = stud;
}

public int getClassno() {
	return classno;
}

public void setClassno(int classno) {
	this.classno = classno;
}


   
 
}
