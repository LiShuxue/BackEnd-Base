package com.lsx.demo;

public class HelloSpeaker implements IHello {

	@Override
	public String getHello(String name) {
		//切入日志的开始
		return "hello," + name;
		//当前return的结果，会被传到afterReturning()方法里去
		//在最后切入的程序中，依然有机会去操作业务的返回值
		//切入 “输出返回值是什么，和日志的结束”
	}

}
