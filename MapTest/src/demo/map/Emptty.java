package demo.map;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

public class Emptty {

	private String name;
	private int age;
	private double price;
	private Date day;
	
	public Emptty(String name,int age,double price,String day) throws Exception{
		
		this.name = name;
		this.age = age;
		this.price = price;
		DateFormat format = new SimpleDateFormat("yy-mm");
		this.day = format.parse(day);
		
	}

	
	
	public Date getDay() {
		return day;
	}



	public void setDay(Date day) {
		this.day = day;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
