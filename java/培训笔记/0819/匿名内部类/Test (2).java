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
		//�����ڲ������������  ������
		
		
		new Test().method(new IMyInterface() {
			@Override
			public void test() {
				System.out.println("method�е�test");
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