package xiancheng;

public class MyThreadAndMyRunnableTest {
	public static void main(String[] args) {
		
		System.out.println("主线程已启动");
		
		MyThread m1 = new MyThread();
	
		MyRunnable m2 = new MyRunnable();  //m2不能直接start(),需要先通过m2实例化一个Thread对象
		Thread t = new Thread(m2);
		
		m1.start();
		t.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("主线程执行第" + (i+1) + "次");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
}
