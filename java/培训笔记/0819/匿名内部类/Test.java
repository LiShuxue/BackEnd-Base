package com.zyw;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		//����1
		Person p = new Student();
		p.test();
		
		//����2��ʹ�������ڲ��࣬�Լ�����д����ȥ����Person�����࣬
		final int num = 100;	//��test�����з���num
		Person p2 = new Person() {	//������������ڲ���
			@Override
			void test() {
				System.out.println("��������  test");
				//�����ڲ���ȥ�����ⲿ�ķǡ����ԡ�����������Ҫʹ��final
				System.out.println(num);
			}
		};
		
		p2.test();
		
		
	}
	
}

/**
 * ����test()������ִ��
 *
 */
abstract class Person{
	abstract void test();
}

/**
 * ����1 ����Person�����࣬��дtest()����
 */
class Student extends Person{

	@Override
	void test() {
		System.out.println("student test");
	}
	
}






