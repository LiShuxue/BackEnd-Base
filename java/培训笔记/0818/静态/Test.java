package com.zyw;

public class Test {

	public static void main(String[] args) {
		/**
		 *  static ��̬
		 *  
		 *  �����е� ���ԡ����� �Ǿ�̬�ģ���ô���ǾͲ������ڶ���"����"
		 *  	�������� ���ࡱ�����ǡ� ������Դ
		 *  ���ԣ����ǽ�static����Դ��Ϊ  ����Դ
		 *  ��Java����еľ�̬��Դ���ڳ�������ʱ��������ص��ڴ棬�������ʹ�������ڴ�ֱ�ӵ���
		 *  ����Щ�� ��̬����Դ��ֻ������õ�ʱ�򣬲Ż�ȥ������ �ڴ�
		 *  
		 */
	
		//������������ȥ���ʾ�̬����
		Student s1 = new Student();
		System.out.println(s1.name);
		//s1�޸��˸�����
		s1.name = "lisi";
		Student s2 = new Student();
		System.out.println(s2.name);
		//ͨ�����棬����Կ���s1,s2���ʵ���ͬһ��name
		//���Ƽ�ʹ�ö���ȥ���ʣ����Ƽ���ͨ������ȥ���ʣ���Ϊ��̬����Դ����������ʵ���
		System.out.println(Student.name);
		//ͨ������ȥ���þ�̬����
		Student.method();
		/*
		 * ֻҪ���������ţ���Ծ�̬���������κβ���������Ч�ġ�
		 * ��̬����Դ���ᱻ �������� ������һֱ���ڣ�ֱ��������ֹ
		 */
	}

}

class Student{

	//��̬����
	public static String name = "zhangsan";
	
	public static void method(){
		System.out.println("����һ����̬����");
	}
}












