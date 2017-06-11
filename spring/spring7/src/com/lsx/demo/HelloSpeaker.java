package com.lsx.demo;


public class HelloSpeaker implements IHello {

	/**
	 * 我的业务方法，我需要通过两个接口，向该方法执行的前后，加入日志
	 */
	@Override
	public void hello(String name) {
		System.out.println("Hello," + name);
	}

}
