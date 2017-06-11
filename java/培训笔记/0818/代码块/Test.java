package com.zyw;

public class Test {

	public static void main(String[] args) {
		/**
		 *  块
		 *  Java中块，主要用来实例化当前类对象之前 做的初始化工作
		 *  	比如 调用其他类的一些方法等等。。
		 */
		Student s = new Student();
		//每一次创建student对象，它的块都会执行一次
		Student s2 = new Student();
	}

}

class Student{

	private int sid;
	
	{
		//这里就是一个块,在构造方法前 执行
		sid = 100;
		System.out.println("块在执行");
	}
	
	public Student(){
		System.out.println("无参构造");
	}
	
	
	
}












