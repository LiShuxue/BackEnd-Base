package base;
import java.util.Scanner;


public class U {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个数：");
		int val = input.nextInt();
		System.out.println("根据这个值可以输出以下加法表：");
		for(int i=0,j=val; i<=val; i++,j--) {
			System.out.println(i + " + " + j + " = " + (i+j));
		}
	}
}
