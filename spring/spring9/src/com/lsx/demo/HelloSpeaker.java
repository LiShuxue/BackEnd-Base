package com.lsx.demo;

public class HelloSpeaker implements IHello {
	
	//将切入 Advice中的before内容，在执行任意方法之前
	@Override
	public void hello(String name) {
		System.out.println("Hello," + name);
	}

}
