package com.lsx.demo;

public class HelloSpeaker implements IHello {

	@Override
	public String hello(String name) {
		return "Hello," + name;
	}

}
