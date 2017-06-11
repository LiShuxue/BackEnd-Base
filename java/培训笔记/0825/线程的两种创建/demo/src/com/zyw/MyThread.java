package com.zyw;

public class MyThread extends Thread {

	/**
	 * 重写父类的run()方法，写上你要做的事情
	 */
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("线程1:" + i);
			try {
				Thread.sleep(500);	//线程等待（休眠）500毫秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
