package xiancheng;

public class MyThread extends Thread {
	//��д�����run����
	public void run() {
		System.out.println("�߳�1������");	
		for(int i=0; i<10; i++) {
			System.out.println("�߳�1ִ�е�" + (i+1) + "��");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
