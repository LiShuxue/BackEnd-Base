package Proxy.jingtai;

public class Test {

	public static void main(String[] args) {
		/*
		 * ͨ������ִ��hello����
		 * ���ȣ�HelloSpeaker��HelloProxy ��ʵ����IHello�ӿ�
		 * �� HelloProxy���� ����һ��IHello���͵�helloObject���ԣ�
		 * 		���Ա���һ��ʵ����IHello�ӿڵĶ�����HelloSpeaker��HelloSpeakerʵ����IHello�ӿڣ�
		 * ��HelloProxy���Hello()���� �� �ֵ��� HelloSpeaker�� hello()������ǰ�������־
		 * ��HelloProxy ��̬���� IHello ������hello() ִ��
		 * 		HelloProxy���Hello()
		 * 			��־
		 * 				HelloSpeaker�� hello()
		 * 			��־
		 * 
		 * 	��̬������ص㣺��Ҫ�������Լ����� һһ����Ҫ�������Ϊ������дN��������
		 * 		��д�ӿ��е����з�����
		 */
		
		//ͨ������ִ��
		IHello proxy = new HelloProxy(new HelloSpeaker());
		proxy.hello("lisi");
		//���ô���
		IHello proxy2 = new HelloSpeaker();
		proxy2.hello("lisi");
	}

}
