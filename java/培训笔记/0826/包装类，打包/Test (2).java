package com.zyw;
public class Test {

	public static void main(String[] args) {
		//�����ĵ���
		System.out.println(Test.myMethod(10));
	}
	
	/**
	 * ����һ������������ֵ ������ �ǰ�װ����
	 * ʹ�ð�װ���ͺ� �������;���һ���� ����Ҫ�и�����
	 */
	
	public static Double myMethod(Integer num){
		Double d = num + 12.12;
		return d;
	}

}

