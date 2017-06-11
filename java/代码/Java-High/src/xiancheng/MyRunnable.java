package xiancheng;

public class MyRunnable implements Runnable{

	//必须实现这个run方法
	//方法中内容就是你要在这个线程中做的事情
	public void run() {
		System.out.println("线程2已启动");
		for(int i=0; i<10; i++) {
			System.out.println("线程2执行第" + (i+1) + "次");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
