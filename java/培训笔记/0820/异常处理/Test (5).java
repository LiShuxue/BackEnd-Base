package com.zyw;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Date;

import javax.management.RuntimeErrorException;

public class Test {

	public static void main(String[] args) {
	

			//你自己定义的异常类，以后一定要去抛出它，不然他就没有用处了
			try {
				throw new MyException("异常-01");
			} catch (MyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
}

/**
 * 自定义异常类
 */
class MyException extends Exception{
	
	public MyException(){
		super();
	}
	
	public MyException(String msg){
		super(msg);
	}
}

