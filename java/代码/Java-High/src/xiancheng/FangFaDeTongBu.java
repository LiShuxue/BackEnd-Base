package xiancheng;
public class FangFaDeTongBu {
	public static void main(String[] args) {
		/**
		 *  方法的同步
		 */
		//创建两个线程，让他们都执行
		ThreadE a = new ThreadE();
		ThreadF b = new ThreadF();
		a.start();
		b.start();
		//以上两个线程同时执行
	}	
	/**
	 * 将方法同步，方法被同步（synchronized）之后，它只能供一个线程去访问，当该线程访问执行结束时候，
	 * 其他的线程才能 访问该方法
	 * 线程之间的访问需要排队的，前者完成后，后者才开始 
	 */
	public synchronized static void test(){
		for(int i=0; i<10; i++){
			System.out.println(i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

/**
 * 两个线程都调用了 test()方法
 */
class ThreadE extends Thread{
	@Override
	public void run() {
		FangFaDeTongBu.test();
	}	
}

class ThreadF extends Thread{
	@Override
	public void run() {
		FangFaDeTongBu.test();
	}
}





