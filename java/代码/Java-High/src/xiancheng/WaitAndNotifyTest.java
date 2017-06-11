package xiancheng;

public class WaitAndNotifyTest {
	public static void main(String[] args) {
		ThreadC a = new ThreadC();
		a.start();
		
		//在3秒后唤醒等待的线程
		try {
			Thread.sleep(3000); 
			synchronized (a) {        //等待和唤醒的时候都要进行同步
				a.notify();           //唤醒
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}

class ThreadC extends Thread {

	public void run() {
		for(int i=1; i<=10; i++) {
			//当i为3的时候，让当前这个线程进入等待状态
			if(i==3) {
				
				//synchronized (this) 同步当前执行的该类对象
				//外界任意代码位置，使用该类对象的时，都必须等待以下的代码执行完毕，才能使用该类对象
				synchronized (this) {
					try {
						this.wait();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			System.out.println("C ： " + i);
		}
	}
}
