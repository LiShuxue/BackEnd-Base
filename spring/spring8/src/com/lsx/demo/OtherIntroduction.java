package com.lsx.demo;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.IntroductionInterceptor;
/**
 * 必须同时实现要加入功能的接口 
 * IOther,就是我要加入的功能
 *
 */
public class OtherIntroduction implements IntroductionInterceptor, IOther {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		//如果执行的方法来自IOther接口
		/*
		 * methodInvocation 方法对象的代理
		 * getMethod()	得到方法的对象
		 * getDeclaringClass() 得到该方法的类或  "接口"	得到接口的Class对象
		 */
		//System.out.println("1:"+methodInvocation.getMethod().getDeclaringClass());
		
		if(this.implementsInterface(methodInvocation.getMethod().getDeclaringClass())){
			//执行额外加入的行为，将当前的代理对象更换为当前类的对象，执行当前类中的doOther()方法
			return methodInvocation.getMethod().invoke(this, methodInvocation.getArguments());
		}
		//执行原有行为 调用proceed() 立即执行该方法
		//System.out.println("2:"+methodInvocation);
		
		//拦截结束了， 执行代理对象任务。
		return methodInvocation.proceed();	
	}

	/**
	 *  clazz 与  IOther 是否是相同类或接口，或者是其父类或超接口
	 */
	@Override
	public boolean implementsInterface(Class<?> clazz) {
		return clazz.isAssignableFrom(IOther.class);
	}

	@Override
	public void doOther() {
		System.out.println("额外增加的职责。。。。");
	}

	
	

}
