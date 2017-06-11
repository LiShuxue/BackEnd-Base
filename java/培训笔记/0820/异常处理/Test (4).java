package com.zyw;

import java.util.Arrays;
import java.util.Date;

import javax.management.RuntimeErrorException;

public class Test {

	public static void main(String[] args) {
		
		try {
			System.out.println("开始");
			int a = 0;
			int b = 10 / a;
			System.out.println("你猜，我会执行吗？");
			
		} catch (RuntimeException e) {
			System.out.println(1);
		} catch (Exception e2){
			System.out.println(2);
		}
		
		//当异常处理中，有子父类，只会执行一个
		
	}
	
	
	

}

