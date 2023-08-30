package com.zyw;
public class Test {

	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		a.start();
		
		//在3秒后，唤醒 a这个线程
		try {
			Thread.sleep(3000);
			synchronized (a) {
				a.notify();//唤醒
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/**
 * 创建两个线程，在线程B中访问线程A的对象，并调用线程A对象的join()方法
 */
class ThreadA extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			//当i为3的时候，让当前这个线程进入等待状态
			if( i == 3){
				//synchronized (this) 同步当前执行的该类对象
				//外界任意代码位置，使用该类对象的时，都必须等待以下的代码执行完毕，才能使用该类对象
				synchronized (this) {
					try {
						this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			System.out.println("A : " + i);
		}
	}	
}





