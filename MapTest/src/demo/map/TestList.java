package demo.map;
/**
 * 可以使用iterator方法遍历容器
 */

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TestList {
	
	
	public static void name(List list){
		
		for(int i=0;i<list.size();i++){
			
			System.out.println(((Emptty) list.get(i)).getName());
		}
		
	}
	
	public static void main(String[] args) throws Exception{
		
		Emptty e=new Emptty("ss",23,234,"2001-11");
		Emptty e1=new Emptty("ww",25,244,"2101-11");
		Emptty e2=new Emptty("33",24,254,"2401-11");
		
		List list = new ArrayList();
		
		
		list.add(e);
		list.add(e1);
		list.add(e2);
		
	    name(list);
	    
	
}
	

}
