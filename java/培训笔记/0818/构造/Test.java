package com.zyw;

public class Test {

	public static void main(String[] args) {
		//调用参数为int的构造
		//在创建对象的同时为当前对象的属性赋初始值
		Student s = new Student(200);
		
		//在 new 后面的Student() ，就是构造方法
		//实例化对象之后，再访问属性sid，获得他的值是0
		System.out.println(s.getSid());	//输出200
		
		//调用无参构造
		Student s2 = new Student();
		System.out.println(s2.getSid());
	}

}

class Student{
	/**
	 *  构造方法
	 *  1.与类名相同
	 *  2.没有返回值类型部分
	 *  3.不能使用return
	 *  构造方法的作用：
	 *  	1.用来创建对象
	 *  	2.对类中的属性进行初始化（赋初始值）
	 *  
	 *  有4个部分组成：访问修饰、方法名（类名相同）、参数列表、方法体
	 *  
	 *  如果你自己没有 标明（写）一个类构造，在编译时，虚拟机为你加一个该类的默认构造
	 *  默认构造 ：是一个没有参数的构造，而且在构造中，会将你当前类的所有的属性
	 *  		都进行初始化，数值为0，布尔为false，引用为null
	 *  如果你自己写了一个够造（比如是有参数的），也不会给你加默认构造
	 *  
	 *  构造方法依然可以重载，与方法重载相同
	 */
	private int sid;
	
	//写了一个够造，不给你加默认构造
	//所以，你在调用没参数的构造就是报错的
	public Student(int sid){
		this.sid = sid;
	}
	
	//以后我还需要调用无参构造，自己要再写一个
	//当你的无参构造中没有为属性赋初始值，虚拟机依然会为你加上 this.sid=0
	public Student(){}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}
	
	
}












