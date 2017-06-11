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
			System.out.println("A ： " + i);
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
					this.a.join();   //在B线程中调用A线程的join方法，可以将当前的执行权让给A线程，A线程执行完后执行B线程
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("B ： " + i);
		}
	}
}
