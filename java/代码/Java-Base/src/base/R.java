package base;
import java.util.Scanner;

public class R {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个数：");
		String num = input.next();
		char[] c = num.toCharArray();
		for(int i=c.length-1; i>=0; i--) {
			System.out.print(c[i]);
		}
		
	}
}
