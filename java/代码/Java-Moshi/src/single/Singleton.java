package single;
/**
 * �������ģʽ
 * �ص㣺1.��������˽�е�    2.���صĶ�����ͬһ��     3.�����ṩһ����̬����     4.���Ч��
 */

public class Singleton {    //������
	private String name;
	private static Singleton sin = new Singleton();
	
	private  Singleton() {    //˽�еĹ�����
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Singleton getSin() {
		return sin;
	}

	public static void setSin(Singleton sin) {
		Singleton.sin = sin;
	}
	
	

	
}

