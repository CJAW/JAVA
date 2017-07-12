package lab9;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**   
* 项目名称：lab9   
* 类名称：FileReadWrite   
* 类描述：使用字节流进行文件的读写   
* 创建人：潘正军  
* 创建时间：2013-10-19 下午8:06:33   
* 修改人：Administrator   
* 修改时间：2013-10-19 下午8:06:33   
* 修改备注：   
* @version 1.0.0   
*
 */
public class FileOutputInputStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		File file = new File("d:\\IoStreamReadWrite.txt");//创建文件对象
		//创建文件输出流对象
		BufferedOutputStream fos=new BufferedOutputStream(new DataOutputStream(new FileOutputStream(file)));
		
		//创建byte型字节数组
		byte byteArray[]="我是广州大学华软软件学院软件工程系的学生，我正在学习Java程序设计的IO部分。".getBytes();
		//将数组中的信息写入到文件中
		fos.write(byteArray);
		fos.close();
		//创建文件输入流对象
		InputStream ios=new BufferedInputStream(new DataInputStream(new FileInputStream(file)));
		//获取实际可读字节数，也即文件总大小
		int length=ios.available();
		//创建byte字节数组
		byte byteA[] = new byte[length];
		//从文件中读取信息
		int len=ios.read(byteA);
		//将文件中信息以字节形式输出
		System.out.println("将文件中信息以字节形式输出是：");
		for (int i = 0; i < byteA.length; i++) {
			System.out.print(byteA[i]);
		}
		System.out.println("");
		//将文件中信息以字符串形式输出
		System.out.println("将文件中信息以字符串形式输出是：\n"+new String(byteA,0,len));
		//关闭输入流
		ios.close();
	}

}
