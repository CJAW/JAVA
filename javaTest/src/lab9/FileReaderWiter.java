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
 * ��Ŀ���ƣ�lab9   
 * �����ƣ�FileReaderWiter   
 * �������� ʹ���ַ��������ļ���д  
 * �����ˣ�������  
 * ����ʱ�䣺2013-10-27 ����3:43:57   
 * �޸��ˣ�Administrator   
 * �޸�ʱ�䣺2013-10-27 ����3:43:57   
 * �޸ı�ע��   
 * @version 1.0.0   
 *    
 */

public class FileReaderWiter {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// �����ļ�����
		File file = new File("d:\\fileReaderWriter.txt");
		// ����FileWriter����
		Writer fw = new BufferedWriter(new FileWriter(file));
		// ����д����ַ���
		String str = "���ǹ��ݴ�ѧ�������ѧԺ�������ϵ��ѧ����������ѧϰJava������Ƶ�IO���֡�";
		fw.write(str);// ֱ�����ļ���д���ַ���
		fw.close();// �ر�������
		// ����FileReader����
		Reader fr = new BufferedReader(new FileReader(file));
		// ����char���飬���������������������ַ���
		char mychar[] = new char[100];
		// ���ļ��ж�ȡ��Ϣ
		int len = fr.read(mychar);
		// ���ļ�����Ϣ���ַ�����ʽ���
		System.out.println("���ļ�����Ϣ���ַ�����ʽ���:");
		// ��char������Ϣת��Ϊ�ַ���
		String string = new String(mychar, 0, len);
		System.out.println("" + string);
		// �ر�������
		fr.close();
	}



}
