package xiancheng;

public class MyRunnable implements Runnable{

	//����ʵ�����run����
	//���������ݾ�����Ҫ������߳�����������
	public void run() {
		System.out.println("�߳�2������");
		for(int i=0; i<10; i++) {
			System.out.println("�߳�2ִ�е�" + (i+1) + "��");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
