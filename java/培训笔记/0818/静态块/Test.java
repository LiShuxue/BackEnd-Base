package com.zyw;

public class Test {

	public static void main(String[] args) {
		/**
		 *   ��̬��
		 *   Ҳ�����㴴������֮ǰ��������ʼ�������ġ�
		 *   ���ǣ�ֻ����Ը��� ��һ�� ʵ��������ʱ���Ż�ִ�У�֮��Ͳ���ִ����
		 *   
		 *   ��̬������ֻ��ʹ�þ�̬���ԣ�����ʹ�÷Ǿ�̬����
		 *   ��̬�����в���ʹ�� this��super�ؼ���
		 *   ��̬�������ܱ���д�����췽�������Ǿ�̬
		 */
		
		//��һ��ʵ����,ִ�о�̬��
		Student s = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
	}

}

class Student{
	
	public Student(){
		System.out.println("����student����");
	}
	
	static{
		System.out.println("���Ǿ�̬��");
	}
}












