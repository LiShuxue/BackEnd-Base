package com.zyw;

import java.util.Arrays;
import java.util.Date;

import javax.management.RuntimeErrorException;

public class Test {

	public static void main(String[] args) {
		try{
			//手动抛出异常
			int a = 0;
			System.out.println(10 / a);
		}catch(Exception e){
			System.out.println("爷爷类");
			//处理时，再抛出异常,后面的代码就不执行了
			//throw new RuntimeException();
		}
		//处理的异常，catch后的代码会执行
		System.out.println("hello");
	}

}

