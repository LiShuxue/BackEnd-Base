package com.zyw;
public class Test {

	public static void main(String[] args) {
		//创建一个线程对象，MyThread对象
		MyThread my1 = new MyThread();
		//启动这个线程
		my1.start();
		
		//通过接口实现类MyRunnable 创建一个对象
		MyRunnable my2 = new MyRunnable();
		//将其传入线程构造
		Thread t = new Thread(my2);
		//启动线程
		t.start();
		
		/**
		 * 以上，就是启动了两个线程同时工作
		 */
	}

}
