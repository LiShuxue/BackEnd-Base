package com.zyw;

public class Test {

	public static void main(String[] args) {
		/**
		 *  ��
		 *  Java�п飬��Ҫ����ʵ������ǰ�����֮ǰ ���ĳ�ʼ������
		 *  	���� �����������һЩ�����ȵȡ���
		 */
		Student s = new Student();
		//ÿһ�δ���student�������Ŀ鶼��ִ��һ��
		Student s2 = new Student();
	}

}

class Student{

	private int sid;
	
	{
		//�������һ����,�ڹ��췽��ǰ ִ��
		sid = 100;
		System.out.println("����ִ��");
	}
	
	public Student(){
		System.out.println("�޲ι���");
	}
	
	
	
}












