package com.zyw.test;

public class Test {
	
	public static void main(String[] args) {
		Test.test();
		Test.test();
	}
	
	static{
		//��һ��ʹ�ø�����Դʱִ��
		System.out.println(2);
	}
	
	{
		//����������ִ��
		System.out.println(3);
	}

	public static void test(){
		System.out.println(1);
	}

}
