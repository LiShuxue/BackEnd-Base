package com.zyw.test;

public class Test {
	
	public static void main(String[] args) {
		Test.test();
		Test.test();
	}
	
	static{
		//第一次使用该类资源时执行
		System.out.println(2);
	}
	
	{
		//不创建对象不执行
		System.out.println(3);
	}

	public static void test(){
		System.out.println(1);
	}

}
