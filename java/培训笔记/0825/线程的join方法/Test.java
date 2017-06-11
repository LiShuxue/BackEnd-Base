package com.zyw;
public class Test {

	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB(a);
		a.start();
		b.start();
	}

}

/**
 * ���������̣߳����߳�B�з����߳�A�Ķ��󣬲������߳�A�����join()����
 */
class ThreadA extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("A : " + i);
		}
	}	
}

class ThreadB extends Thread{
	private ThreadA a;
	//ͨ�����췽������ֵ���� �߳�A
	public ThreadB(ThreadA a){
		this.a = a;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if( i > 5){
				try {
					//��ǰ�߳��ó�ִ��Ȩ����Aִ�У���Aִ�н����󣬵�ǰ��B�̲߳Ż����
					this.a.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("B : " + i);
		}
	}
	
	
}



