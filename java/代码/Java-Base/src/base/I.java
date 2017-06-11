package base;
import java.util.Scanner;


public class I {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		int b = (int)a;
		String s = String.valueOf(b);
		System.out.println((b+"").length());
		System.out.println(s.length());
		
	}
}
