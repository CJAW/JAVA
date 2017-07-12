package abstractInterface.better.test;
/**  
* ��Ŀ���ƣ�lab7   
* �����ƣ�CarFactory   
* �����������ඨ����һ����̬����getCar(),�����Ը����û�ָ���ĳ�������������   
* �����ˣ�������  
* ����ʱ�䣺2013-10-14 ����9:58:48   
* �޸��ˣ�Administrator   
* �޸�ʱ�䣺2013-10-14 ����9:58:48   
* �޸ı�ע��   
* @version 1.0.0   
*
 */
public class CarFactory {
 public static Car  getCar(String carName) {
	if (carName.equalsIgnoreCase("Bentley")) {
		return new Bentley();
	}else if (carName.equalsIgnoreCase("Audi")) {
		return new Audi();
	}else {
		return null;
	}
}
}
