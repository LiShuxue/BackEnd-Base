package com.zyw;

import java.util.Arrays;
import java.util.Date;

import javax.management.RuntimeErrorException;

public class Test {

	public static void main(String[] args) {
		try{
			//�ֶ��׳��쳣
			int a = 0;
			System.out.println(10 / a);
		}catch(Exception e){
			System.out.println("үү��");
			//����ʱ�����׳��쳣,����Ĵ���Ͳ�ִ����
			//throw new RuntimeException();
		}
		//������쳣��catch��Ĵ����ִ��
		System.out.println("hello");
	}

}

