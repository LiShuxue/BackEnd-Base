package com.zyw;

public class Test {

	public static void main(String[] args) {
		/**
		 *  方法参数、返回值  的多态
		 *  父类对象永远都无法调用子类自己扩展的新资源
		 */
		Test t = new Test();
		t.method01(new Employee());
		t.method02(1).eat();
	}
	
	/** 
	 * 参数是父类型（形参），可以传入任意子类型（实参）
	 */
	public void method01(Person p){
		p.eat();
	}
	
	/**
	 *	  返回值类型是父类型，可以返回任意子类型
	 */
	public Person method02(int code){
		switch(code){
			case 1:
				return new Student();
			default:
				return new Employee();
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











