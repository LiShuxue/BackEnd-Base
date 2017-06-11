package com.zyw;

public class Test {

	public static void main(String[] args) {
		MyClass c = new MyClass();
		Test t = new Test();
		//1
		/*System.out.println(c.num);
		t.myMethod(c);	//将引用拷贝一份给参数c1
		System.out.println(c.num);*/
		//输出的什么？
		
		//2
		System.out.println(c.num);
		t.myMethod2(c);	//c将引用给c1，他们引用相同内存，c1改200，c也改了
		System.out.println(c.num);
		//输出的什么？
	}
	
	public void myMethod(MyClass c1){
		MyClass m1 = new MyClass();
		m1.num = 200;
		c1 = m1;
	}
	
	public void myMethod2(MyClass c1){
		c1.num = 200;
	}

}

/**
 * 在一个Java源文件中，可以定义多个类
 * 只能有一个类是public class
 * main函数只能写在public class的类中
 */
class MyClass{
	int num = 100;
}










