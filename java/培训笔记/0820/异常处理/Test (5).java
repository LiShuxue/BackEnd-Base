package com.zyw;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Date;

import javax.management.RuntimeErrorException;

public class Test {

	public static void main(String[] args) {
	

			//���Լ�������쳣�࣬�Ժ�һ��Ҫȥ�׳�������Ȼ����û���ô���
			try {
				throw new MyException("�쳣-01");
			} catch (MyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
}

/**
 * �Զ����쳣��
 */
class MyException extends Exception{
	
	public MyException(){
		super();
	}
	
	public MyException(String msg){
		super(msg);
	}
}

