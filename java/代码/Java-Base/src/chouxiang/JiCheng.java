package chouxiang;

public class JiCheng {
	public static void main(String[] args) {
		Students s = new Students();
		s.eat();
		s.run();
		s.study();
	}
}

class Person{
	protected String name;      //protected ͬ�����������
	protected int age;
	
	public void eat() {
		System.out.println("�Է�");
	}
	
	public void run() {
		System.out.println("����");
	}
	
}

class Students extends Person{
	private int sid;
	
	public void study() {
		System.out.println("ѧϰ");
	}
}


/**
 * �������д��һ���������Ĺ��죬������Ͳ���������޲ι����ˣ���ʱ�����һ����̳�������࣬������������û��д���췽���������ʧ��
	��ʱ�Ͳ���ʵ�������࣬��Ϊʵ��������ʱ���������Ĭ�Ϲ��췽���е�һ����super��������������û���޲ι���
 *
 */
//class A{
//	
//	A(int i){
//		
//	}
//}
//class B extends A{
//	
//}
	
	

