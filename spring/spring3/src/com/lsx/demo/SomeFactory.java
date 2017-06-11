package com.lsx.demo;

public class SomeFactory{
	//·Ç¾²Ì¬·½·¨
	public ISome createInstance(){
		return new ISome(){
			@Override
			public void show() {
				System.out.println("show.......");
			}
		};
	}

}
