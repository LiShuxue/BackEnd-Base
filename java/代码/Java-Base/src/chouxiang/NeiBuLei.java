package chouxiang;

import oop.a;

/**
 * �ڲ��������һ�����Ϊ������
 * һ�㲻���ڲ���
 *
 */
public class NeiBuLei {
	public static void main(String[] args) {
		//D d = new D();         //main�����в���ֱ��new�Ǿ�̬���ڲ��࣬������new��̬���ڲ���
		E e = new E();
		D d = new NeiBuLei().new D(); //���ǿ���ͨ���ⲿ��Ķ���ȥnew�ڲ���
	}
	public void a() {
		D d1 = new D();          //����main�����Ϳ��������
		E e1 = new E();
		D d2 = new NeiBuLei().new D();
	}
	
	class D{
		
	}
	static class E{
		
	}
}

