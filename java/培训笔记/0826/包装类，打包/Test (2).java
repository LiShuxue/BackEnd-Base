package com.zyw;
public class Test {

	public static void main(String[] args) {
		//方法的调用
		System.out.println(Test.myMethod(10));
	}
	
	/**
	 * 定义一个方法，返回值 、参数 是包装类型
	 * 使用包装类型和 基本类型就是一样的 。不要有负担。
	 */
	
	public static Double myMethod(Integer num){
		Double d = num + 12.12;
		return d;
	}

}

