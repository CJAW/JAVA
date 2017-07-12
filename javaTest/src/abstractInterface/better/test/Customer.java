package abstractInterface.better.test;
/**  
* ��Ŀ���ƣ�lab7   
* �����ƣ�Customer   
* �����������࣬������������У������û�����Ҫ��ȡ��ͬ������   
* �����ˣ�������  
* ����ʱ�䣺2013-10-14 ����9:59:01   
* �޸��ˣ�Administrator   
* �޸�ʱ�䣺2013-10-14 ����9:59:01   
* �޸ı�ע��   
* @version 1.0.0   
*
 */
public class Customer {
	public static void main(String[] args) {
		System.out.println("�˿�Ҫ���������");
		Car bentley=CarFactory.getCar("Bentley");
		System.out.println("��ȡ������"+bentley.getInfo());
		System.out.println("����������������"+bentley.getBrand());
		
		System.out.println("�˿�Ҫ����µϣ�");
		Car audi=CarFactory.getCar("Audi");
		System.out.println("��ȡ������"+audi.getInfo());
		System.out.println("����������������"+audi.getBrand());
	}
}
