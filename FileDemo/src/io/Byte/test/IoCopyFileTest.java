package io.Byte.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 字节流
 * 输入流与输出流文件的拷贝
 * 
 * 步骤：
 * 1.建立联系(选择流）
 * 2.确定读取大小
 * 3.确定实际的大小
 * 4.循环写出
 * 5.释放资源
 * @author user
 *
 *加入缓冲流提高性能  字节流 :
 *      bufferedInputStream
 *      bufferedInputStream
 *
 */

public class IoCopyFileTest {

	public static void main(String[] args) throws IOException {

		File file1 = new File("/Users/user/Desktop/PHP/1.text"); // 原文件
		File file2 = new File("/Users/user/Desktop/PHP/2.text"); // 目标文件

		// String file1="/Users/user/Desktop/PHP/1.text";
		// String file2="/Users/user/Desktop/PHP/2.text";
		CopyFile(file1, file2);

	}

	public static void CopyFile(File file1, File file2) throws IOException {

		// 选择流
		InputStream in = new BufferedInputStream(new FileInputStream(file1));
		OutputStream out =new BufferedOutputStream( new FileOutputStream(file2));

		if (!file1.isFile()) {
			throw new IOException("不能读取文件夹");
		}

		byte[] flush = new byte[100];// 读取长度

		int len = 0;// 实际读取长度

		// 文件读取
		while (-1 != (len = in.read(flush))) {

			// 文件写出
			out.write(flush, 0, len);

		}

		out.flush();
		out.close();
		in.close();
	}

	public static void CopyFile(String srcPath, String destPath) throws IOException {

		File file1 = new File(srcPath); // 原文件
		File file2 = new File(destPath); // 目标文件
		
		CopyFile(file1,file2);

	}

}
