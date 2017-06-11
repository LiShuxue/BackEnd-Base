package com.lsx.interceptor;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.omg.CORBA.DynAnyPackage.Invalid;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class TimeInterceptor implements Interceptor {

	@Override
	public void destroy() {}

	@Override
	public void init() {}

	/**
	 * 核心的拦截方法
	 */
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//你可以在DemoAction1 它处理请求之前 。。。之后 插入你想要加的功能。
		//这都是之前的事儿
		Logger logger = Logger.getLogger("TimeInterceptor");
		logger.log(Level.INFO,"DemoAction1要开始执行了。");
		//执行DemoAction1  并得到它返回的 逻辑视图 名
		String result = invocation.invoke();
		//现在是之后的事儿
		logger.log(Level.INFO, "DemoAction1 执行完了，返回的逻辑视图名是:" + result);
		//最后返回  逻辑视图名
		return result;
	}

}








