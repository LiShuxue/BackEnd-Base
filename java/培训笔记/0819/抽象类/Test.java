package com.zyw;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		//Person p = new Person();	���������಻�ܱ�ʵ����
		Person p = new Student();
		p.eat();
		p.run();
	}

}

abstract class Person{
	//���󷽷���û�з����壬�г��󷽷�����ͱ����ǳ�����
	public abstract void eat();
	
	//����������зǳ���ķ���
	public void run(){
		System.out.println("Person����");
	}
}

//���ߵ���˼�������Ҫʵ�ָ���ĳ��󷽷�
//���಻�ǳ����࣬�ͱ���ʵ��(���̳еĳ��󷽷����ϡ������塱)
class Student extends Person{

	@Override	//��д����ķ���
	public void eat() {
		System.out.println("ѧ���Է�");
	}

}






