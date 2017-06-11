package com.zyw;

import java.util.Arrays;
import java.util.Date;

import javax.management.RuntimeErrorException;

public class Test {

	public static void main(String[] args) {
		//无论什么情况，finally里的代码一定会执行
		try {
			throw new Exception("我的异常");
		} catch (Exception e) {
			System.out.println("异常信息是：" + e.getMessage());
			System.out.println("异常的处理");
		} finally{
			System.out.println("必须执行的finally");
		}
		
		//这样也是可以的
		try{
			
		}finally{
			
		}
		
		Test.test();
		
	}
	
	public static void test(){
		//return 只有在try..catch中，finally才必须执行
		try{
			int a = 1;
			int a1 = 1;
			int a2 = 1;
			if(a == 1){
				return;
			}
			int a3 = 1;
			int a4 = 1;
			int a5 = 1;
			int a6 = 1;
		
			System.out.println("try");
		}finally{
			System.out.println("finally");
		}
	}
	

}

