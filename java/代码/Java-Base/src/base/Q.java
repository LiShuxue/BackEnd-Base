package base;

public class Q {
	public static void main(String[] args) {
		int i = 2006;
		double sum = 8;
		
		do {
			sum *= 1.25;
			i++;
		} while(sum<=20);
		System.out.println(i);
	}

}
