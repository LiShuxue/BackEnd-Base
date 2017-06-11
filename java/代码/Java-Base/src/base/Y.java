package base;
import java.util.Scanner;


public class Y {
	public static void main(String[] args) {
		Y y = new Y();
//		y.first();
//		y.second();
//		y.third();
//		y.four();
		y.five();
	}
	
	public void first() {
		int i;
		int sum = 0;
		for(i=1 ; i<=100; i++) {
			if(i%3==0 && i>=3) {
				continue;
			}
			else {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
	
	public void second() {
		int i;
		int sum =0;
		for(i=1; i<=10; i++) {
			sum = sum + i;
			if(sum >20) {
				break;
			}
		}
		System.out.println(i);
	}
	
	public void third() {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入行数：");
		int rows = input.nextInt();
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void four() {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入行数：");
		int rows = input.nextInt();
		
		for(int i=1; i<=rows; i++) {
			for(int j=i; j<=rows-1; j++) {
				System.out.print(" ");
			}
	
			for(int k=1; k<=i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	
	public void five() {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入行数：");
		int n = input.nextInt();
		int rows = n / 2 + 1;
		for (int i = 1; i <= rows; i++) {
			for (int j = i; j <= rows - 1; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();

		}
		for (int i = 1; i < rows; i++) {
			for (int j = 0; j <= i - 1; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= (rows * 2 - i * 2 - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
