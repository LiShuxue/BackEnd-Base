package base;
import java.util.Date;


public class O {
	public static void main(String[] args) {
		while(true) {
			Date d = new Date();
			System.out.println(d);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
