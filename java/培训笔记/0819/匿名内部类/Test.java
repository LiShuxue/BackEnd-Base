package com.zyw;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		//方案1
		Person p = new Student();
		p.test();
		
		//方案2，使用匿名内部类，自己不用写代码去创建Person的子类，
		final int num = 100;	//在test方法中访问num
		Person p2 = new Person() {	//这里就是匿名内部类
			@Override
			void test() {
				System.out.println("匿名子类  test");
				//匿名内部类去访问外部的非“属性”变量，变量要使用final
				System.out.println(num);
			}
		};
		
		p2.test();
		
		
	}
	
}

/**
 * 调用test()方法、执行
 *
 */
abstract class Person{
	abstract void test();
}

/**
 * 方案1 创建Person的子类，重写test()方法
 */
class Student extends Person{

	@Override
	void test() {
		System.out.println("student test");
	}
	
}






