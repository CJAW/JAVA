package io.Byte.test;

import java.io.File;
import java.io.IOException;

/**
 * 拷贝文件夹
 * @author user
 *
 */

public class IoCopyDirection {

	public static void main(String[] args) throws IOException{
		
		File file1 = new File("/Users/user/Desktop/PHP/Test/"); // 原文件
		File file2 = new File("/Users/user/Desktop/PHP/");
	
	    if(file1.isDirectory()){
	    	
	    	file2 = new File("/Users/user/Desktop/PHP/",file1.getName()); // 目标文件
	     }
	    
	    if(file2.getAbsolutePath().contains(file1.getAbsolutePath())){
	    	
	    	System.out.println("父目录不能拷贝到子目录");
	    	return;
	    }
	    CopyDirction(file1,file2);
	    
	}
	
	public static void CopyDirction(File file1,File file2) throws IOException{
		
		if(file1.isFile()){
			
			IoCopyFileTest.CopyFile(file1, file2);
			
		}
			
		else if(file1.isDirectory()){
			
			file2.mkdirs(); //确保文件夹存在
			
			for(File list:file1.listFiles()){   //获得下级目录
				
				CopyDirction(list,new File(file2,list.getName()));
				
			}
			
		}
		
	}
	

}
