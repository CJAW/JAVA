package map.list.javabean.save_result;
/**
 * javaBean 处理结果集的存储
 * @author user
 *
 */

public class BeanMath {

	private int id;
	private String pw;
	private int time;
	
	
	public BeanMath() {
		super();
		
	}
	
	public BeanMath(int id, String pw, int time) {
		super();
		this.id = id;
		this.pw = pw;
		this.time = time;
	}

	
	public BeanMath(String pw, int time) {
		super();
		this.pw = pw;
		this.time = time;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	
}
