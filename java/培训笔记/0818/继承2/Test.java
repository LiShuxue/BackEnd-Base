package com.zyw;

public class Test {

	public static void main(String[] args) {
		Student s = new Student();
		/**
		 * 1.��lisi��22���� Student�Ĺ�����
		 * 2.Student�Ĺ������ٽ� ����ͨ��super�����������������Ĺ���Person(String name,int age)
		 * 3.Person�Ĺ���Ὣlisi 22 ��ֵ������ name age	
		 * 4.����Student�ּ̳��˸��������������
		 * 5.����s2.name ��lisi  s2.age��22	
		 */
		Student s2 = new Student("lisi", 22);
		System.out.println(s2.name);
		System.out.println(s2.age);
	}

}

class Person{
	protected String name;
	protected int age;
	
	public Person(){

	}
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
}


class Student extends Person{
	public Student(){
		super();	//���ø�����޲ι��죬ֻ��д�����๹��ĵ�һ��
		System.out.println("Student����");
	}
	
	public Student(String name,int age){
		super(name, age);
	}
}











