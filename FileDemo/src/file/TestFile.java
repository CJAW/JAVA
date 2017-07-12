package file;

import java.io.File;

public class TestFile {
	
	public static void main(String[] args){
		File f= new File("usr/");
		print(f,0);
	}
	
	 static void print(File file,int level){
		for(int i=0;i<=level;i++)
			
		System.out.println("-");
		
	System.out.println(file.getName());

        if(file.isDirectory()){
		
		File[] files = file.listFiles();
		
		for(File temp:files){
			
			print(temp,level+1);
			
		}
	}
        
}
	
}
