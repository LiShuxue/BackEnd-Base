package com.zyw;

public class Test {

	public static void main(String[] args) {
		/**
		 * 		继承
		 * 已有 人类
		 * 编写 学生类 继承人类	添加学习方法
		 * 	学生不仅能吃，跑，还可以学习。但他的父类就没有这样的行为
		 * 	在Java里，子类只能有一个父类（单继承）
		 */
		Student s = new Student();
		s.eat();
		s.run();
		s.study();
	}

}

class Person{
	protected String name;	//protected 同包、子类可用
	protected int age;		
	
	public void eat(){
		System.out.println("吃饭");
	}
	
	public void run(){
		System.out.println("奔跑");
	}
}

/**
 * 学生继承人类，学生也会拥有人类的特征
 * 继承是对父类的复用和扩展
 */
class Student extends Person{
	private int sid;
	
	public void study(){
		System.out.println("学习");
	}
}











