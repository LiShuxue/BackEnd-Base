package chouxiang;

public class DuoTai {
	
	
/**
 * ͨ�������ʹ���������
 */
//	public static void main(String[] args) {
//		Person1 p = new Students2();
//		p.eat();
//		Person1 p2 = new Employees();
//		p2.eat();
//		
//		System.out.println("------------");
//		
//		Person1[] ps = {new Students2(), new Employees(), p, p2};
//		for(Person1 per : ps) {
//			per.eat();
//		}
//	}
	
	
/**
 * ��������������ֵ�Ķ�̬
 */
	public static void main(String[] args) {
		DuoTai d = new DuoTai();
		d.method01(new Employees());
		d.method02(1).eat();
	}
	
	public void method01(Person1 p) {     //�����Ǹ����ͣ����Դ�������������
		p.eat();
	}
	
	public Person1 method02(int code) {      //����ֵ�Ǹ����ͣ� ���Է��������������
		switch (code) {
		case 1:
			return new Students2();
		default:
			return new Employees();
		}
	}
}

class Person1{

	public void eat() {
		System.out.println("����Է�");
	}
}

class Students2 extends Person1{
	public void eat() {
		System.out.println("ѧ���Է�");
	}
}

class Employees extends Person1 {
	public void eat() {
		System.out.println("Ա���Է�");
	}
}
