package com.zyw;
public class Test {

	public static void main(String[] args) {
		/**
		 *  ������ͬ��
		 */
		//���������̣߳������Ƕ�ִ��
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		a.start();
		b.start();
		//���������߳�ͬʱִ��
	}
	
	public static void test(){
		for(int i=0; i<10; i++){
			System.out.println(i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

/**
 * �����̶߳������� test()����
 * @author Administrator
 *
 */
class ThreadA extends Thread{

	@Override
	public void run() {
		Test.test();
	}
	
}

class ThreadB extends Thread{
	@Override
	public void run() {
		Test.test();
	}
}





