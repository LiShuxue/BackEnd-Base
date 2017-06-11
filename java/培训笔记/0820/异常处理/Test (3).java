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
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	

}

