package com.zyw;

public class Test {

	public static void main(String[] args) {
		/**
		 *  子类 通过 super调用父类属性和方法
		 */
		Student s = new Student();
		
	}

}

class Person{
	protected String name = "lisi";
	
	public void eat(){
		System.out.println("父类中吃饭方法");
	}
}


class Student extends Person{
	
	/**
	 * 当子类中，你自己写了一个和父类相同的方法，将无法继承父类的方法
	 * 父类本来给子类一个方法，但子类不使用，自己写了一个相同的方法，这样的行为叫做 方法重写
	 * 在重写的过程中可以去增大访问权限，比如从 protected 重写为 publics
	 * 但反之不可以
	 * 重写不可以修改返回值类型
	 */
	public void eat(){
		//调用父类的属性 和方法
		System.out.println("父类的名字是：" + super.name);
		super.eat();
		System.out.println("子类吃饭方法");
	}
	
	/*public void eat(int a){
		这么写就重载了
	}*/
	
}











