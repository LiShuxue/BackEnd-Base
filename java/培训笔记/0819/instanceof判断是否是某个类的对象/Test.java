package com.zyw;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		/**
		 * 	instanceof
		 * 他是一个操作符，使用它判断 一个对象是否是某一个类（接口）的对象
		 * 这个判断将返回一个boolean值
		 */
		Person p = new Person();
		//p是不是Person的对象，左是对象，右是类名或接口名
		if(p instanceof Person){
			System.out.println("是");
		}else{
			System.out.println("不是");
		}
		
		Student s = new Student();
		//因为他的父类是Person，没有父类就没有它
		System.out.println(s instanceof Person ? "是" : "不是");
		Person e = new Employee();
		System.out.println(e instanceof Student ? "是" : "不是");
		//在Java里所有类的祖宗 Object，当你自己定义一个类，它没有继承任意类，默认继承Object
		System.out.println(p instanceof Object ? "是" : "不是");
		//如果任何类都是Object的子类或者孙子...类，那么就可以是Object来多态
		Object[] obj = {p , s , e ,new Date()};
		//但是要注意，这些子类自己所扩展的方法、属性，将无法调用
		for (Object o : obj) {
			if(o instanceof Person){
				//强制转换回它以前的类型,如果不转换回去，将无法调用eat方法
				//因为Object类中并没有eat方法
				Person per = (Person)o;
				per.eat();
			}
		}
		
	}
	
}

class Person{
	public void eat(){
		System.out.println("人类吃饭");
	}
}

class Student extends Person{
	public void eat(){
		System.out.println("学生吃饭");
	}
}

class Employee extends Person{
	public void eat(){
		System.out.println("员工吃饭");
	}
}











