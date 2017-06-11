package com.zyw;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		String s = new String();	//创建一个空字符串 ""
		System.out.println(s.equals(""));
		String s1 = "hello";
		String s2 = "hello";
		//双等比较，比较他们的引用是否相同
		System.out.println(s1 == s2);
		
		String s3 = new String("hello");
		String s4 = new String("hello");
		//开辟两个新的内存空间保存字符串，所有他们的引用是不相同的
		System.out.println(s3 == s4);
	}

}
