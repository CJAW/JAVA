package Lab7;
/** 
* ��Ŀ���ƣ�lab7   
* �����ƣ�InterfaceTest   
* ��������������   
* �����ˣ�������  
* ����ʱ�䣺2013-10-13 ����9:20:20   
* �޸��ˣ�Administrator   
* �޸�ʱ�䣺2013-10-13 ����9:20:20   
* �޸ı�ע��   
* @version 1.0.0   
*
 */
public class InterfaceTest {
	public static void main(String[] args) {
		System.out.println("ʵ��������ʽ���ò�ͬ��������ԡ��ܡ�˯��Ϊ��");
		Person person = new Person();
		person.eat();
		person.run();
		person.swim();
		System.out.println("\n������ʹ�ýӿڱ��������������õ��÷����Ľ����\n");
		Runner r=person;
		r.run();
		Swimmer s=person;
		s.swim();
		Animal a=person;
		a.eat();
	}
}
