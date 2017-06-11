package xiancheng;

public class JoinTest {
	public static void main(String[] args) {
		ThreadC a = new ThreadC();
		ThreadB b = new ThreadB(a);
		a.start();
		b.start();
	}

}

class ThreadA extends Thread {

	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("A �� " + i);
		}
	}
}

class ThreadB extends Thread {
	private ThreadC a;
	
	public ThreadB(ThreadC a) {
		this.a = a;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			if(i>5) {
				try {
					this.a.join();   //��B�߳��е���A�̵߳�join���������Խ���ǰ��ִ��Ȩ�ø�A�̣߳�A�߳�ִ�����ִ��B�߳�
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("B �� " + i);
		}
	}
}
