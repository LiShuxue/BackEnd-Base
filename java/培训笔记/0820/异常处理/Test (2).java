package com.zyw;

import java.util.Arrays;
import java.util.Date;

import javax.management.RuntimeErrorException;

public class Test {

	public static void main(String[] args) {
		//����ʲô�����finally��Ĵ���һ����ִ��
		try {
			throw new Exception("�ҵ��쳣");
		} catch (Exception e) {
			System.out.println("�쳣��Ϣ�ǣ�" + e.getMessage());
			System.out.println("�쳣�Ĵ���");
		} finally{
			System.out.println("����ִ�е�finally");
		}
		
		//����Ҳ�ǿ��Ե�
		try{
			
		}finally{
			
		}
		
		Test.test();
		
	}
	
	public static void test(){
		//return ֻ����try..catch�У�finally�ű���ִ��
		try{
			int a = 1;
			int a1 = 1;
			int a2 = 1;
			if(a == 1){
				return;
			}
			int a3 = 1;
			int a4 = 1;
			int a5 = 1;
			int a6 = 1;
		
			System.out.println("try");
		}finally{
			System.out.println("finally");
		}
	}
	

}

