package com.zyw;

public class MyRunnable implements Runnable {

	//Runnable �е�run��������Ҫ��д��
	//run()�о�����Ҫ������߳�����ʲô����
	@Override
	public void run() {
		//��ʲô�¶�
		for (int i = 0; i < 10; i++) {
			System.out.println("�߳�2:" + i);
			try {
				Thread.sleep(500);	//�̵߳ȴ������ߣ�500����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
