package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException {
	
	public static void main(String[] args){
		String str = new TestException().openFile();
		System.out.println("str");
	}
	
	String openFile(){
		try {
			
			FileReader file = new FileReader("/usr");
			int f = file.read();
			System.out.println("aaa");
			return "spet1";
		} catch (FileNotFoundException e) {
			System.out.println("bbb");
			e.printStackTrace();
			return "spet2";
		}catch(IOException e){
			e.printStackTrace();
			return "spet3";
		}finally{
			System.out.println("dddd");
			//return "spet4";
			}
		
		
	}
	

}
