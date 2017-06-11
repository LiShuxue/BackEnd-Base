package com.zyw;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
		/*Test t = new Test();
		//当你输出对象的时候，默认调用对象的toString()方法
		System.out.println("直接输出对象：" + t);
		System.out.println("调用对象的toString()：" + t.toString());*/
		
		Teacher t = new Teacher();
		System.out.println(t);
		Teacher t2 = new Teacher("lisi", 22, "北京");
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
		//this.getClass().getName()获得包名和类名
		return this.getClass().getName() + "[name=" +name+ ",age="+age+",address="+address+"]";
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











