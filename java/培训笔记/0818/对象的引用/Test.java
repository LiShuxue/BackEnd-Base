package com.zyw;

public class Test {

	public static void main(String[] args) {
		
		int n = 100;
		Test t = new Test();
		//�򷽷�myMehtod�д��ݵ���n�ĸ��������˷����Ĳ���num
		//���ԣ�������num�ĸı���n ��û���κι�ϵ��
		t.myMehtod(n);
		System.out.println("n=" + n);
	}
	
	public void myMehtod(int num){
		num += 200;
		System.out.println("num=" + num);
	}
}










