package com.zyw;

public class Test {

	public static void main(String[] args) {
		/**
		 * 		��̬
		 * 	ͨ�������� ȥ����ĳ��������
		 */
		//ʵ���� ѧ����ʱͨ������Person����ʾ
		Person p = new Student();
		//System.out.println(p);
		p.eat();
		
		//ͨ��Person��ʾԱ��
		Person p2 = new Employee();
		//System.out.println(p2);
		p2.eat();
		System.out.println("----------");
		Person[] ps = {new Student() , new Employee(), p , p2};
		for (Person person : ps) {
			person.eat();
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











