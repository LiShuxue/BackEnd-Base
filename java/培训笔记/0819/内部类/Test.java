package com.zyw;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		//通过 外部类对象.new 内部类()
		MyClass c = new Test().new MyClass();
		
		//创建静态内部类对象
		MyClass2 c2 = new Test.MyClass2();
	}
	
	class MyClass{
		
	}
	
	static class MyClass2{

	}
}

