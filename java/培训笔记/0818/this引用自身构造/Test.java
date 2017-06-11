package com.zyw;

public class Test {

	public static void main(String[] args) {
		/**
		 *  this 引用自身构造方法
		 */
		//Student s = new Student(10);
		Student s = new Student();
	}

}

class Student{

	/**
	 * 在该无参构造中调用下方的有参构造，依然写在第一行
	 */
	public Student(){
		this(20);
		System.out.println("无参构造");
	}
	
	/**
	 * 在该构造方法中调用上方的无参构造
	 * 使用this来调用，但是必须写在构造代码中的第一行
	 * @param sid
	 */
	public Student(int sid){
		//this();
		System.out.println("参数sid的构造");
	}
}












