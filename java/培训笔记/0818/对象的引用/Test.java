package com.zyw;

public class Test {

	public static void main(String[] args) {
		
		int n = 100;
		Test t = new Test();
		//向方法myMehtod中传递的是n的副本，给了方法的参数num
		//所以，方法中num的改变与n 是没有任何关系的
		t.myMehtod(n);
		System.out.println("n=" + n);
	}
	
	public void myMehtod(int num){
		num += 200;
		System.out.println("num=" + num);
	}
}










