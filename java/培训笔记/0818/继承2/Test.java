package com.zyw;

public class Test {

	public static void main(String[] args) {
		Student s = new Student();
		/**
		 * 1.将lisi、22传到 Student的构造中
		 * 2.Student的构造中再将 他们通过super传到父类两个参数的构造Person(String name,int age)
		 * 3.Person的构造会将lisi 22 赋值给属性 name age	
		 * 4.子类Student又继承了父类这个两个属性
		 * 5.所有s2.name 是lisi  s2.age是22	
		 */
		Student s2 = new Student("lisi", 22);
		System.out.println(s2.name);
		System.out.println(s2.age);
	}

}

class Person{
	protected String name;
	protected int age;
	
	public Person(){

	}
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
}


class Student extends Person{
	public Student(){
		super();	//调用父类的无参构造，只能写在子类构造的第一行
		System.out.println("Student构造");
	}
	
	public Student(String name,int age){
		super(name, age);
	}
}











