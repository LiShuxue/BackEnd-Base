package com.zyw;

public class Test {

	public static void main(String[] args) {
		/**
		 * 		�̳�
		 * ���� ����
		 * ��д ѧ���� �̳�����	���ѧϰ����
		 * 	ѧ�������ܳԣ��ܣ�������ѧϰ�������ĸ����û����������Ϊ
		 * 	��Java�����ֻ����һ�����ࣨ���̳У�
		 */
		Student s = new Student();
		s.eat();
		s.run();
		s.study();
	}

}

class Person{
	protected String name;	//protected ͬ�����������
	protected int age;		
	
	public void eat(){
		System.out.println("�Է�");
	}
	
	public void run(){
		System.out.println("����");
	}
}

/**
 * ѧ���̳����࣬ѧ��Ҳ��ӵ�����������
 * �̳��ǶԸ���ĸ��ú���չ
 */
class Student extends Person{
	private int sid;
	
	public void study(){
		System.out.println("ѧϰ");
	}
}











