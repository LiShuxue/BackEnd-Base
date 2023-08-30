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
 * 创建两个线程，在线程B中访问线程A的对象，并调用线程A对象的join()方法
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
	//通过构造方法，赋值属性 线程A
	public ThreadB(ThreadA a){
		this.a = a;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if( i > 5){
				try {
					//当前线程让出执行权，让A执行，再A执行结束后，当前的B线程才会继续
					this.a.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("B : " + i);
		}
	}
	
	
}



