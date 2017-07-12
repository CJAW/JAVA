package datatest;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {


	public static void main(String[] args) {
		
		Calendar d=new GregorianCalendar();
		
		
		//d.set(2001,Calendar.FEBRUARY,10,12,23,36);
		
		d.set(Calendar.YEAR,2015);
		d.set(Calendar.MONTH,1);
		d.set(Calendar.DATE,2);
		
		d.add(Calendar.MONTH,9);
		Date c =d.getTime();

		System.out.print(c);
	}

}
