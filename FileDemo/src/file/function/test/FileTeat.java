package file.function.test;

/**
 * 相关方法查阅文档。
 */

import java.io.File;
import java.io.IOException;

public class FileTeat {
	
	
	public static void main(String[] args) throws IOException{
		
		String src = "/Users/user/Desktop/swift/";
		
		File file = new File(src);
		
		//System.out.println(file.getAbsolutePath());//返回绝对路径
		
		//System.out.println(file.getParent());//返回上级目录,无这返回null，是相对路径返回null;
		
		//System.out.println(file.getPath());//绝对路径，返回绝对路径,这返回相对路径或无这返回null
		
		//System.out.println(file.getName());//返回文件名
		//System.out.println(file.delete());
		
		System.out.print(file.isFile());//判断是否为文件，没有后缀，这默认为文件夹
		
		file.createNewFile();//不存在创建文件夹
		
		//file.createTempFile(prefix, suffix, directory)创建临时文件，关闭后自动删除。
		//file.mkdir();创建文件加，如果没有父目录这创建失败
		//file.mkdirs();创建文件夹，如果没有父目录，这连父目录一起创建。
	}

}
