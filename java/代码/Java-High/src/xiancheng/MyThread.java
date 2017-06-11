package xiancheng;

public class MyThread extends Thread {
	//重写父类的run方法
	public void run() {
		System.out.println("线程1已启动");	
		for(int i=0; i<10; i++) {
			System.out.println("线程1执行第" + (i+1) + "次");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
