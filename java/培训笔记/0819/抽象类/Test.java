package com.zyw;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		//Person p = new Person();	报错，抽象类不能被实例化
		Person p = new Student();
		p.eat();
		p.run();
	}

}

abstract class Person{
	//抽象方法，没有方法体，有抽象方法的类就必须是抽象类
	public abstract void eat();
	
	//抽象类可以有非抽象的方法
	public void run(){
		System.out.println("Person奔跑");
	}
}

//红线的意思：你必须要实现父类的抽象方法
//子类不是抽象类，就必须实现(给继承的抽象方法加上“方法体”)
class Student extends Person{

	@Override	//重写父类的方法
	public void eat() {
		System.out.println("学生吃饭");
	}

}






