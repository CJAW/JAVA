package abstractInterface.better.test;
/**    
* ��Ŀ���ƣ�lab7   
* �����ƣ�Audi   
* ������������̳���Car�ಢʵ������getInfo()���� 
* �����ˣ�������  
* ����ʱ�䣺2013-10-14 ����9:58:10   
* �޸��ˣ�Administrator   
* �޸�ʱ�䣺2013-10-14 ����9:58:10   
* �޸ı�ע��   
* @version 1.0.0   
*
 */
public class Audi extends Car {
	@Override
	public String getInfo() {
		return "Audi";
	}
	@Override
	public void alarmNotice() {
		System.out.println("���ˣ������ڵ������İµϳ���");
	}
	@Override
	public String getBrand() {
		return "�µ�������ר�ñ�����";
	}
}
