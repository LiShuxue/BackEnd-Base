package chouxiang;

public class ChouXiangLei {

	public static void main(String[] args) {
		//B b = new B();        //�����಻�ܱ�ʵ����
		
		A a = new A();
		a.eat();
		a.run();
		
		B a1 = new A();          //Ҳ�����ö�̬��ʽ
		a1.eat();
		a1.run();
		
	}
}

abstract class B{            //������
	public abstract void eat();
	
	public void run() {
		System.out.println("����");
	}
}

class A extends B {
	public void eat() {         //��д����ķ�����������δʵ�ֵĳ��󷽷�ʵ��
		System.out.println("�Է�");
	}
}