package oop;

public class People {
	String name;
	int age;
	
	public void info() {
		System.out.println(name+"������Ϊ��" + age + "����Ʊ" + price(age));
		System.out.println();
	}
	
	public String price(int age) {
		if(age>12) {
			return "�۸�Ϊ��20Ԫ";
		}
		else 
			return "���";
	}
}
