package com.zyw;

public class Test {

	public static void main(String[] args) {
		/**
		 *   静态块
		 *   也是在你创建对象之前，来做初始化工作的。
		 *   但是，只有你对该类 第一次 实例化对象时，才会执行，之后就不再执行了
		 *   
		 *   静态方法中只能使用静态属性，不能使用非静态属性
		 *   静态方法中不能使用 this、super关键字
		 *   静态方法不能被重写，构造方法不能是静态
		 */
		
		//第一次实例化,执行静态块
		Student s = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
	}

}

class Student{
	
	public Student(){
		System.out.println("创建student对象");
	}
	
	static{
		System.out.println("我是静态块");
	}
}












