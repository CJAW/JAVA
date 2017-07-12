package abstractInterface.better.test;
/**  
* ��Ŀ���ƣ�lab7   
* �����ƣ�Bentley   
* ������������̳���Car�ಢʵ������getInfo()����   
* �����ˣ�������  
* ����ʱ�䣺2013-10-14 ����9:58:22   
* �޸��ˣ�Administrator   
* �޸�ʱ�䣺2013-10-14 ����9:58:22   
* �޸ı�ע��   
* @version 1.0.0   
*
 */
public class Bentley extends Car {
	@Override
	public String getInfo() {
		return "Bentley";
	}
	@Override
	public void alarmNotice() {
		System.out.println("���ˣ������ڵ������ı�������");
	}
	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return "����������ר�ñ�����";
	}
}
