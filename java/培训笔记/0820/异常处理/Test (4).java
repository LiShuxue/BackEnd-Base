package com.zyw;

import java.util.Arrays;
import java.util.Date;

import javax.management.RuntimeErrorException;

public class Test {

	public static void main(String[] args) {
		
		try {
			System.out.println("��ʼ");
			int a = 0;
			int b = 10 / a;
			System.out.println("��£��һ�ִ����");
			
		} catch (RuntimeException e) {
			System.out.println(1);
		} catch (Exception e2){
			System.out.println(2);
		}
		
		//���쳣�����У����Ӹ��ֻ࣬��ִ��һ��
		
	}
	
	
	

}

