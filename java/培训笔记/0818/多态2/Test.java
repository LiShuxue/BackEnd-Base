package com.zyw;

public class Test {

	public static void main(String[] args) {
		/**
		 *  ��������������ֵ  �Ķ�̬
		 *  ���������Զ���޷����������Լ���չ������Դ
		 */
		Test t = new Test();
		t.method01(new Employee());
		t.method02(1).eat();
	}
	
	/** 
	 * �����Ǹ����ͣ��βΣ������Դ������������ͣ�ʵ�Σ�
	 */
	public void method01(Person p){
		p.eat();
	}
	
	/**
	 *	  ����ֵ�����Ǹ����ͣ����Է�������������
	 */
	public Person method02(int code){
		switch(code){
			case 1:
				return new Student();
			default:
				return new Employee();
		}
	}

}

class Person{
	public void eat(){
		System.out.println("����Է�");
	}
}

class Student extends Person{
	public void eat(){
		System.out.println("ѧ���Է�");
	}
}

class Employee extends Person{
	public void eat(){
		System.out.println("Ա���Է�");
	}
}











