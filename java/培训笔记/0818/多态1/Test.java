package com.zyw;

public class Test {

	public static void main(String[] args) {
		/**
		 * 		多态
		 * 	通过父类型 去代表某个子类型
		 */
		//实例化 学生类时通过父类Person来表示
		Person p = new Student();
		//System.out.println(p);
		p.eat();
		
		//通过Person表示员工
		Person p2 = new Employee();
		//System.out.println(p2);
		p2.eat();
		System.out.println("----------");
		Person[] ps = {new Student() , new Employee(), p , p2};
		for (Person person : ps) {
			person.eat();
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











