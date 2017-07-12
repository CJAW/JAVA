package other.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 其它的数据流的文件拷贝：
 * 
 * 字节数组流：
 * 文件－－>字节ByteArrayOutputStream
 * 
 * 
 * 写出时ByteArrayOutputStream中的write有新增的方法，不能使用多肽。
 * @author user
 *
 */

public class IoArrayByte {

	public static void main(String[] args) throws IOException{
		
		FileDetel(getFileByte("/Users/user/Desktop/PHP/1.text"),"/Users/user/Desktop/PHP/2.text");
		
		
	}
	/**
	 * 文件－－>字节ByteArrayOutputStream
	 * @param strPath
	 * @return
	 * @throws IOException
	 */
	public static byte[] getFileByte(String strPath) throws IOException{
		
		byte[] dest = null;
		//不能使用多肽，ByteArrayOutputStream中的write有新增的方法
		InputStream in= new BufferedInputStream(new FileInputStream(new File(strPath)));
		
		ByteArrayOutputStream otu = new ByteArrayOutputStream();
		
		byte[] flush = new byte[1024];
		int len=0;
		
		while(-1!=(len=in.read(flush))){
			
			otu.write(flush, 0, len);
		}
		dest=otu.toByteArray();
		otu.flush();
		otu.close();
		in.close();
		
		return dest;
	}
	
	/**
	 * 
	 * @param by
	 * @param srcPath
	 * //字节－－>文件ByteArrayInputStream
	 * @throws IOException
	 */
	
	public static void FileDetel(byte[] by,String srcPath) throws IOException{
		
		InputStream in= new BufferedInputStream(new ByteArrayInputStream(by));
	
		OutputStream ot = new BufferedOutputStream(new FileOutputStream(new File(srcPath)));//写入文件的目录
		
		byte[] flush = new byte[1024];
		
		int len=0;
		
		while(-1!=(len=in.read(flush))){
			
			ot.write(flush, 0, len);
		}
		
		ot.flush();
		ot.close();
		in.close();
		
	}
	
}
