package com.zyw;
public class Test {

	public static int num = 0;	//�����ʵ�����
	
	public static void main(String[] args) {
		/**
		 *  �̲߳�������
		 */
		//���������̣߳������Ƕ�ִ��
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		a.start();
		b.start();
		//���������߳�ͬʱִ��
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





