package com.zyw;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
		/*Test t = new Test();
		//������������ʱ��Ĭ�ϵ��ö����toString()����
		System.out.println("ֱ���������" + t);
		System.out.println("���ö����toString()��" + t.toString());*/
		
		Teacher t = new Teacher();
		System.out.println(t);
		Teacher t2 = new Teacher("lisi", 22, "����");
		System.out.println(t2);
	}

}


class Teacher{
	private String name;
	private int age;
	private String address;
	
	public Teacher(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Teacher() {
		super();
	}

	@Override
	public String toString() {
		//this.getClass().getName()��ð���������
		return this.getClass().getName() + "[name=" +name+ ",age="+age+",address="+address+"]";
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











