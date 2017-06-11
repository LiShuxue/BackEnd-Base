package com.lsx.demo;

public class HelloSpeaker implements IHello {

	@Override
	public void hello(String name) {
		System.out.println("Hello," + name);
	}

}
