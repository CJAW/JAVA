package Lab7;
/**
 * 
*    
* ��Ŀ���ƣ�lab7   
* �����ƣ�Person   
* ����������ͨ�࣬�̳��˳�����Animal��ʵ���˽ӿ�
* Runner��Swimmer   
* �����ˣ�������  
* ����ʱ�䣺2013-10-13 ����9:20:42   
* �޸��ˣ�Administrator   
* �޸�ʱ�䣺2013-10-13 ����9:20:42   
* �޸ı�ע��   
* @version 1.0.0   
*
 */
public class Person extends Animal implements Runner, Swimmer {

	@Override
	public void swim() {
		System.out.println("����Ӿ�����ܺ�,����Ӿ������Ӿ����Ӿ����Ӿ...");
	}
	@Override
	public void run() {
		System.out.println("���Ƿ�ë��,�ܲ��ٶȼ���!");
	}
	@Override
	public void eat() {
		System.out.println("������θ��,��ɶ����!");
	}
}
