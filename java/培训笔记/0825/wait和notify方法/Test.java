package com.zyw;
public class Test {

	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		a.start();
		
		//��3��󣬻��� a����߳�
		try {
			Thread.sleep(3000);
			synchronized (a) {
				a.notify();//����
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/**
 * ���������̣߳����߳�B�з����߳�A�Ķ��󣬲������߳�A�����join()����
 */
class ThreadA extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			//��iΪ3��ʱ���õ�ǰ����߳̽���ȴ�״̬
			if( i == 3){
				//synchronized (this) ͬ����ǰִ�еĸ������
				//����������λ�ã�ʹ�ø�������ʱ��������ȴ����µĴ���ִ����ϣ�����ʹ�ø������
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





