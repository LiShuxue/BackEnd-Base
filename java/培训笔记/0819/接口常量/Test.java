package com.zyw;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		final int num;	//常量
		num = 100;
		//num = 200;	只能进行一次赋值，以后的值不能改
		
	}
	
	public void method(final int num){
		num = 100;
		//参数final 不可以改变参数值
	}
}

/**
 * 类不能被继承
 *
 */
final class Person{
	
}

class Person2{
	//final的方法不可以被重写
	public final void eat(){
		System.out.println("人类吃饭");
	}
}

class Student extends Person2{
	/*报错
	public void eat(){
		System.out.println("人类吃饭");
	}*/
}


