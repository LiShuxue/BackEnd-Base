package com.lsx.demo;

public class SomeFactory{
	//�Ǿ�̬����
	public ISome createInstance(){
		return new ISome(){
			@Override
			public void show() {
				System.out.println("show.......");
			}
		};
	}

}
