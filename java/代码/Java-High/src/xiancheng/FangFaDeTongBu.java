package xiancheng;
public class FangFaDeTongBu {
	public static void main(String[] args) {
		/**
		 *  ������ͬ��
		 */
		//���������̣߳������Ƕ�ִ��
		ThreadE a = new ThreadE();
		ThreadF b = new ThreadF();
		a.start();
		b.start();
		//���������߳�ͬʱִ��
	}	
	/**
	 * ������ͬ����������ͬ����synchronized��֮����ֻ�ܹ�һ���߳�ȥ���ʣ������̷߳���ִ�н���ʱ��
	 * �������̲߳��� ���ʸ÷���
	 * �߳�֮��ķ�����Ҫ�Ŷӵģ�ǰ����ɺ󣬺��߲ſ�ʼ 
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
 * �����̶߳������� test()����
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





