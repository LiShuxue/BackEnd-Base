package com.zyw;

public class MyThread extends Thread {

	/**
	 * ��д�����run()������д����Ҫ��������
	 */
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("�߳�1:" + i);
			try {
				Thread.sleep(500);	//�̵߳ȴ������ߣ�500����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
