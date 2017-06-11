package com.zyw;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		/**
		 *  接口常量
		 */
		//使用接口常量
		System.out.println(Student.TYPE);
		//Person实现接口,Person也可以调用该常量
		System.out.println(Person.TYPE);
		//System.out.println("大学生");
	}
}

interface Student{
	//常量名 要大写
	public static final String TYPE = "大学生";
}
/**
 * 类实现该接口 该类也会拥有该常量
 */
class Person implements Student{
	//Person类中也可以使用该常量
	public void method(){
		System.out.println(TYPE);
	}
}


