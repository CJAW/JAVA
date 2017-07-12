package io.Byte.Char.demo;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;


/**
 * 字节流转换成字符流解决乱码问题
 * 使用 
 * 输入流：InputSystemRead
 * 输出流：OutputSystemWrite
 * 
 * 有新增方法不能使用多肽，否则方法不能使用
 * @author user
 *
 *bufferedwriter和bufferedreader 是整行的读取，遇到/n 停止。
 *可以使用 newLine()方法加入/n
 *
 *在读取时解码
 */

public class ByteAndChar {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		BufferedReader str = new BufferedReader(new InputStreamReader(new FileInputStream(new File("")),"utf-8"));
	}
}
