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
* ��Ŀ���ƣ�lab9   
* �����ƣ�FileReadWrite   
* ��������ʹ���ֽ��������ļ��Ķ�д   
* �����ˣ�������  
* ����ʱ�䣺2013-10-19 ����8:06:33   
* �޸��ˣ�Administrator   
* �޸�ʱ�䣺2013-10-19 ����8:06:33   
* �޸ı�ע��   
* @version 1.0.0   
*
 */
public class FileOutputInputStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		File file = new File("d:\\IoStreamReadWrite.txt");//�����ļ�����
		//�����ļ����������
		BufferedOutputStream fos=new BufferedOutputStream(new DataOutputStream(new FileOutputStream(file)));
		
		//����byte���ֽ�����
		byte byteArray[]="���ǹ��ݴ�ѧ�������ѧԺ�������ϵ��ѧ����������ѧϰJava������Ƶ�IO���֡�".getBytes();
		//�������е���Ϣд�뵽�ļ���
		fos.write(byteArray);
		fos.close();
		//�����ļ�����������
		InputStream ios=new BufferedInputStream(new DataInputStream(new FileInputStream(file)));
		//��ȡʵ�ʿɶ��ֽ�����Ҳ���ļ��ܴ�С
		int length=ios.available();
		//����byte�ֽ�����
		byte byteA[] = new byte[length];
		//���ļ��ж�ȡ��Ϣ
		int len=ios.read(byteA);
		//���ļ�����Ϣ���ֽ���ʽ���
		System.out.println("���ļ�����Ϣ���ֽ���ʽ����ǣ�");
		for (int i = 0; i < byteA.length; i++) {
			System.out.print(byteA[i]);
		}
		System.out.println("");
		//���ļ�����Ϣ���ַ�����ʽ���
		System.out.println("���ļ�����Ϣ���ַ�����ʽ����ǣ�\n"+new String(byteA,0,len));
		//�ر�������
		ios.close();
	}

}
