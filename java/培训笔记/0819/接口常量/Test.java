package com.zyw;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		final int num;	//����
		num = 100;
		//num = 200;	ֻ�ܽ���һ�θ�ֵ���Ժ��ֵ���ܸ�
		
	}
	
	public void method(final int num){
		num = 100;
		//����final �����Ըı����ֵ
	}
}

/**
 * �಻�ܱ��̳�
 *
 */
final class Person{
	
}

class Person2{
	//final�ķ��������Ա���д
	public final void eat(){
		System.out.println("����Է�");
	}
}

class Student extends Person2{
	/*����
	public void eat(){
		System.out.println("����Է�");
	}*/
}


