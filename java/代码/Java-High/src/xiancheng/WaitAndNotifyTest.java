package xiancheng;

public class WaitAndNotifyTest {
	public static void main(String[] args) {
		ThreadC a = new ThreadC();
		a.start();
		
		//��3����ѵȴ����߳�
		try {
			Thread.sleep(3000); 
			synchronized (a) {        //�ȴ��ͻ��ѵ�ʱ��Ҫ����ͬ��
				a.notify();           //����
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}

class ThreadC extends Thread {

	public void run() {
		for(int i=1; i<=10; i++) {
			//��iΪ3��ʱ���õ�ǰ����߳̽���ȴ�״̬
			if(i==3) {
				
				//synchronized (this) ͬ����ǰִ�еĸ������
				//����������λ�ã�ʹ�ø�������ʱ��������ȴ����µĴ���ִ����ϣ�����ʹ�ø������
				synchronized (this) {
					try {
						this.wait();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			System.out.println("C �� " + i);
		}
	}
}
