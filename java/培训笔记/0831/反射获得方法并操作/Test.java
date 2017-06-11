package com.zyw.test;

import java.lang.reflect.Method;

public class Test {
	
	public static void main(String[] args) throws Exception{
		/**
		 *  自定义一个方法，可以操作所有表（增删改查）
		 *  返回值存在多种情况，比如查询有多个对象、一个对象、没有结果等。。
		 */
		Test t = new Test();
		Method[] method = t.getClass().getMethods();
		for(Method m : method){	//循环Test所有的方法对象
			//如果他的方法是set开头，就调用这个方法
			if(m.getName().startsWith("set")){
				//因为是实例方法，所以要传入一个对象，再传入一个参数，没有返回值
				m.invoke(t, 99);	//调用当前这个方法
			}
			//如果他的方法是get开头，就调用这个方法
			if(m.getName().startsWith("get")){
				//用对象调用，传入实例，没有参数，有返回值result
				Object result =  m.invoke(t, null);
				System.out.println(result);
			}
		}
		
	}
	
	private int num;
	
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
}
	