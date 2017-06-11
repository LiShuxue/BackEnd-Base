package com.zyw;

public class Test {

	public static void main(String[] args) {
		/**
		 *  static 静态
		 *  
		 *  当类中的 属性、方法 是静态的，那么他们就不再属于对象"独有"
		 *  	而是属于 该类”对象们“ 共有资源
		 *  所以，我们将static的资源成为  类资源
		 *  在Java里，所有的静态资源，在程序启动时，都会加载到内存，后期你的使用是在内存直接调用
		 *  而那些非 静态的资源，只有你调用的时候，才会去加载至 内存
		 *  
		 */
	
		//创建两个对象去访问静态属性
		Student s1 = new Student();
		System.out.println(s1.name);
		//s1修改了该属性
		s1.name = "lisi";
		Student s2 = new Student();
		System.out.println(s2.name);
		//通过上面，你可以看到s1,s2访问的是同一个name
		//不推荐使用对象去访问，更推荐你通过类名去访问，因为静态的资源是属于所有实体的
		System.out.println(Student.name);
		//通过类名去调用静态方法
		Student.method();
		/*
		 * 只要程序启动着，你对静态属性做的任何操作都是有效的。
		 * 静态的资源不会被 垃圾回收 ，他会一直存在，直到程序终止
		 */
	}

}

class Student{

	//静态属性
	public static String name = "zhangsan";
	
	public static void method(){
		System.out.println("我是一个静态方法");
	}
}












