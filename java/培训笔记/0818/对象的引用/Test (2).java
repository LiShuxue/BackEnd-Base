package com.zyw;

public class Test {

	public static void main(String[] args) {
		MyClass c = new MyClass();
		Test t = new Test();
		//1
		/*System.out.println(c.num);
		t.myMethod(c);	//�����ÿ���һ�ݸ�����c1
		System.out.println(c.num);*/
		//�����ʲô��
		
		//2
		System.out.println(c.num);
		t.myMethod2(c);	//c�����ø�c1������������ͬ�ڴ棬c1��200��cҲ����
		System.out.println(c.num);
		//�����ʲô��
	}
	
	public void myMethod(MyClass c1){
		MyClass m1 = new MyClass();
		m1.num = 200;
		c1 = m1;
	}
	
	public void myMethod2(MyClass c1){
		c1.num = 200;
	}

}

/**
 * ��һ��JavaԴ�ļ��У����Զ�������
 * ֻ����һ������public class
 * main����ֻ��д��public class������
 */
class MyClass{
	int num = 100;
}










