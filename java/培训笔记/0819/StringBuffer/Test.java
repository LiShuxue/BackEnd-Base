package com.zyw;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		//����ʼ�ĵ�ǰʱ�������
		long begin = System.currentTimeMillis();
		String s1 = "hello";
		/*for (int i = 0; i < 100000; i++) {
			s1 += "hello";
		}*/
		StringBuffer sb = new StringBuffer(s1);
		for (int i = 0; i < 100000; i++) {
			sb.append("hello");
		}
		System.out.println(System.currentTimeMillis() - begin);
	}

}
