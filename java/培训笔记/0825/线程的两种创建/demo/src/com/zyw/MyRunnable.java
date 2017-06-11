package com.zyw;

public class MyRunnable implements Runnable {

	//Runnable 中的run方法，你要重写，
	//run()中就是你要在这个线程中做什么事情
	@Override
	public void run() {
		//做什么事儿
		for (int i = 0; i < 10; i++) {
			System.out.println("线程2:" + i);
			try {
				Thread.sleep(500);	//线程等待（休眠）500毫秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
