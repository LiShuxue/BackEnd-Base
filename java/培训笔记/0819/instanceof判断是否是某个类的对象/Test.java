package com.zyw;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		/**
		 * 	instanceof
		 * ����һ����������ʹ�����ж� һ�������Ƿ���ĳһ���ࣨ�ӿڣ��Ķ���
		 * ����жϽ�����һ��booleanֵ
		 */
		Person p = new Person();
		//p�ǲ���Person�Ķ������Ƕ�������������ӿ���
		if(p instanceof Person){
			System.out.println("��");
		}else{
			System.out.println("����");
		}
		
		Student s = new Student();
		//��Ϊ���ĸ�����Person��û�и����û����
		System.out.println(s instanceof Person ? "��" : "����");
		Person e = new Employee();
		System.out.println(e instanceof Student ? "��" : "����");
		//��Java������������� Object�������Լ�����һ���࣬��û�м̳������࣬Ĭ�ϼ̳�Object
		System.out.println(p instanceof Object ? "��" : "����");
		//����κ��඼��Object�������������...�࣬��ô�Ϳ�����Object����̬
		Object[] obj = {p , s , e ,new Date()};
		//����Ҫע�⣬��Щ�����Լ�����չ�ķ��������ԣ����޷�����
		for (Object o : obj) {
			if(o instanceof Person){
				//ǿ��ת��������ǰ������,�����ת����ȥ�����޷�����eat����
				//��ΪObject���в�û��eat����
				Person per = (Person)o;
				per.eat();
			}
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











