package com.zyw;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		new IMyInterface() {
			@Override
			public void test() {
				System.out.println("execute test");
			}
		}.test();
		//匿名内部类的匿名对象  调方法
		
		
		new Test().method(new IMyInterface() {
			@Override
			public void test() {
				System.out.println("method中的test");
			}
		});
		
	}
	
	public void method(IMyInterface my){
		my.test();
	}
	
}

interface IMyInterface{
	void test();
}