package com.zyw;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		//ͨ�� �ⲿ�����.new �ڲ���()
		MyClass c = new Test().new MyClass();
		
		//������̬�ڲ������
		MyClass2 c2 = new Test.MyClass2();
	}
	
	class MyClass{
		
	}
	
	static class MyClass2{

	}
}

