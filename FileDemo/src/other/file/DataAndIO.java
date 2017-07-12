package other.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 基本数据处理流：
 * 处理基本数据类型＋string;
 * DataInputstream
 * DataOutputStream
 * 
 *
 * @author user
 *文件的拷贝
 */

public class DataAndIO {
	
	public static void main(String[] args){
		
	}
	/**
	 * 文件－－－>基本数据类型－－－－>字节数组
	 * @param strPath
	 * @return
	 * @throws IOException
	 */

public static byte[] getFileByte(String strPath) throws IOException{
		
		byte[] dest = null;
		//不能使用多肽，ByteArrayOutputStream中的write有新增的方法
		InputStream in= new BufferedInputStream(new FileInputStream(new File(strPath)));
		
		ByteArrayOutputStream  dos = new ByteArrayOutputStream();
		
		DataOutputStream otu = new DataOutputStream(new BufferedOutputStream(dos));
		
		
		byte[] flush = new byte[1024];
		int len=0;
		
		while(-1!=(len=in.read(flush))){
			
			otu.write(flush, 0, len);
		}
	
		dos.toByteArray();
		otu.flush();
		otu.close();
		in.close();
		
		return dest;
	}
	
	
/**
 * 字节－－－>基本数据类型－－－－>文件
 * 
 */
	
	public static void FileDetel(byte[] by,String srcPath) throws IOException{
		
		DataInputStream in= new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(by)));
	
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
