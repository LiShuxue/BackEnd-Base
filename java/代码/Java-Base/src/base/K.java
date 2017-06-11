package base;
import java.util.Scanner;
public class K {
	public static void main(String[] args) {
		System.out.print("输入存款（万）：");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		
		if(a>=500) {
			System.out.println("凯迪拉克");
		}
		else if(a>=100) {
			System.out.println("帕沙特");
		}
		else if(a>=50) {
			System.out.println("伊兰特");
		}
		else if(a>=10) {
			System.out.println("奥托");
		}
		else {
			System.out.println("捷安特");
		}
	}
}
