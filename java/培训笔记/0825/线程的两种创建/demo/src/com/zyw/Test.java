package com.zyw;
public class Test {

	public static void main(String[] args) {
		//����һ���̶߳���MyThread����
		MyThread my1 = new MyThread();
		//��������߳�
		my1.start();
		
		//ͨ���ӿ�ʵ����MyRunnable ����һ������
		MyRunnable my2 = new MyRunnable();
		//���䴫���̹߳���
		Thread t = new Thread(my2);
		//�����߳�
		t.start();
		
		/**
		 * ���ϣ����������������߳�ͬʱ����
		 */
	}

}
