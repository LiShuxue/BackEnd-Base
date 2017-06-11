package 打印菱形;

import java.util.Scanner;
/*
 * 题目：打印出如下图案（菱形）   
      *   
    *****   
  *********  
*************   
  *********   
    *****   
      * 
 */

public class PrintGraph {
	public static void main(String[] args) {
		int a = 1;
		int b = 6;
		System.out.print("      ");
		System.out.println("*");
		for(int i=1; i<4; i++) {
			a=a+4;
			b=b-2;
			for(int j=1;j<=b;j++) {
				System.out.print(" ");	
			}
			for(int j=1;j<=a;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=4; i<7; i++) {
			a=a-4;
			b=b+2;
			for(int j=1;j<=b;j++) {
				System.out.print(" ");	
			}
			for(int j=1;j<=a;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
//	public void five() {
//		Scanner input = new Scanner(System.in);
//		System.out.print("请输入行数：");
//		int n = input.nextInt();
//		if(n%2==0 || n==1){
//			System.out.println("菱形不可能是" + n + "行");
//		}
//		else {
//			int rows = n/2+1;
//			for(int i=1; i<=rows; i++) {
//				for(int j=i; j<=rows-1; j++) {
//					System.out.print(" ");
//				}
//		
//				for(int k=1; k<=i*2-1; k++) {
//					System.out.print("*");
//				}
//				System.out.println();
//				
//			}
//			for(int i=1; i<rows; i++) {
//				for(int j=0; j<=i-1; j++) {
//					System.out.print(" ");
//				}
//		
//				for(int k=1; k<=(rows*2-i*2-1); k++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//		}
//		
//		
//	}
}
