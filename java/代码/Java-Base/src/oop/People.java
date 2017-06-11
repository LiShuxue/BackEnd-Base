package oop;

public class People {
	String name;
	int age;
	
	public void info() {
		System.out.println(name+"的年龄为：" + age + "，门票" + price(age));
		System.out.println();
	}
	
	public String price(int age) {
		if(age>12) {
			return "价格为：20元";
		}
		else 
			return "免费";
	}
}
