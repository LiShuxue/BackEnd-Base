package array;

import java.util.Scanner;

public class Array2 {
	int[] a = {8,4,2,1,23,344,12};
	public static void main(String[] args) {
		Array2 ar = new Array2();
		ar.number();
		ar.sum();
		ar.guess();
	}
	
	public void number() {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println();
	}
	
	public void sum() {
		int sum =0;
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("总和为：" + sum);
	}
	
	public void guess() {
		Scanner input = new Scanner(System.in);
		boolean flag= false;
		System.out.print("请输入一个数：");
		int num = input.nextInt();
		for(int i=0; i<a.length; i++) {
			if(num==a[i]) {
				System.out.println("包含数"+ a[i]);
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("不包含数" + num);
		}
	}
}
