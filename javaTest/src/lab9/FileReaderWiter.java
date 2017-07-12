/**
 * 
 */
package lab9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**   
 *    
 * 项目名称：lab9   
 * 类名称：FileReaderWiter   
 * 类描述： 使用字符流进行文件读写  
 * 创建人：潘正军  
 * 创建时间：2013-10-27 下午3:43:57   
 * 修改人：Administrator   
 * 修改时间：2013-10-27 下午3:43:57   
 * 修改备注：   
 * @version 1.0.0   
 *    
 */

public class FileReaderWiter {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// 创建文件对象
		File file = new File("d:\\fileReaderWriter.txt");
		// 创建FileWriter对象
		Writer fw = new BufferedWriter(new FileWriter(file));
		// 创建写入的字符串
		String str = "我是广州大学华软软件学院软件工程系的学生，我正在学习Java程序设计的IO部分。";
		fw.write(str);// 直接向文件中写入字符串
		fw.close();// 关闭输入流
		// 创建FileReader对象
		Reader fr = new BufferedReader(new FileReader(file));
		// 创建char数组，用来保存输入流读出的字符串
		char mychar[] = new char[100];
		// 从文件中读取信息
		int len = fr.read(mychar);
		// 将文件中信息以字符串形式输出
		System.out.println("将文件中信息以字符串形式输出:");
		// 将char数组信息转换为字符串
		String string = new String(mychar, 0, len);
		System.out.println("" + string);
		// 关闭输入流
		fr.close();
	}



}
