package com.zyw;

public class Test {

	public static void main(String[] args) {
		/**
		 *  this ���������췽��
		 */
		//Student s = new Student(10);
		Student s = new Student();
	}

}

class Student{

	/**
	 * �ڸ��޲ι����е����·����вι��죬��Ȼд�ڵ�һ��
	 */
	public Student(){
		this(20);
		System.out.println("�޲ι���");
	}
	
	/**
	 * �ڸù��췽���е����Ϸ����޲ι���
	 * ʹ��this�����ã����Ǳ���д�ڹ�������еĵ�һ��
	 * @param sid
	 */
	public Student(int sid){
		//this();
		System.out.println("����sid�Ĺ���");
	}
}












