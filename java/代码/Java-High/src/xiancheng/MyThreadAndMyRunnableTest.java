package xiancheng;

public class MyThreadAndMyRunnableTest {
	public static void main(String[] args) {
		
		System.out.println("���߳�������");
		
		MyThread m1 = new MyThread();
	
		MyRunnable m2 = new MyRunnable();  //m2����ֱ��start(),��Ҫ��ͨ��m2ʵ����һ��Thread����
		Thread t = new Thread(m2);
		
		m1.start();
		t.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("���߳�ִ�е�" + (i+1) + "��");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
}
