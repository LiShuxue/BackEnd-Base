package com.zyw;

public class Test {

	public static void main(String[] args) {
		/**
		 * 		单例模式
		 * 	使用单例模式的类，只有一个对象，而且你不可以实例化
		 * 	这个类自己会去维护自己这个为一个对象，在你每次想要的时候，给你同一个
		 * 	1.私有化类的构造
		 * 	2.定义一个 私有 静态 当前类的对象 作为属性
		 * 	3.通过一个公有  静态 的方法（一般都起名叫 getInstance() ）来返回该属性
		 */
		
		/*System.out.println(Student.getInstance());
		System.out.println(Student.getInstance());
		System.out.println(Student.getInstance());*/
		
		Student.getInstance().sayHello("haoChen");
		Student.getInstance().sayHello("feiJin");
	}

}

class Student{
	private static Student stu = null;
	private Student(){
		
	}
	public static Student getInstance(){
		if(stu == null){
			stu = new Student();
		}
		return stu;
	}
	
	public void sayHello(String name){
		System.out.println("hello:" + name);
	}
	
}












