package com.zyw;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		/**
		 *  �ӿڳ���
		 */
		//ʹ�ýӿڳ���
		System.out.println(Student.TYPE);
		//Personʵ�ֽӿ�,PersonҲ���Ե��øó���
		System.out.println(Person.TYPE);
		//System.out.println("��ѧ��");
	}
}

interface Student{
	//������ Ҫ��д
	public static final String TYPE = "��ѧ��";
}
/**
 * ��ʵ�ָýӿ� ����Ҳ��ӵ�иó���
 */
class Person implements Student{
	//Person����Ҳ����ʹ�øó���
	public void method(){
		System.out.println(TYPE);
	}
}


