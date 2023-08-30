package com.zyw;
public class Test {

	public static int num = 0;	//被访问的数据
	
	public static void main(String[] args) {
		/**
		 *  线程并发访问
		 */
		//创建两个线程，让他们都执行
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		a.start();
		b.start();
		//以上两个线程同时执行
	}

}

/**
 * 两个线程都调用了 test()方法
 * @author Administrator
 *
 */
class ThreadA extends Thread{

	@Override
	public void run() {
		while(true){
			Test.num++;
			System.out.println(Test.num);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class ThreadB extends Thread{
	@Override
	public void run() {
		while(true){
			Test.num++;
			System.out.println(Test.num);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}





