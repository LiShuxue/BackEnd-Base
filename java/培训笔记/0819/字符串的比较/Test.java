package com.zyw;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		String s = new String();	//����һ�����ַ��� ""
		System.out.println(s.equals(""));
		String s1 = "hello";
		String s2 = "hello";
		//˫�ȱȽϣ��Ƚ����ǵ������Ƿ���ͬ
		System.out.println(s1 == s2);
		
		String s3 = new String("hello");
		String s4 = new String("hello");
		//���������µ��ڴ�ռ䱣���ַ������������ǵ������ǲ���ͬ��
		System.out.println(s3 == s4);
	}

}
