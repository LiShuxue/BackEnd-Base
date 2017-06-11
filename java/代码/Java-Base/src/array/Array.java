package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Array a = new Array();
//		a.a();
//		a.b();
//		a.c();
//		a.d();
//		a.e();
		a.f();
	}
	
	public void a() {
		int[] num = {1,2,3};
		String[] name = {"T恤","运动鞋","网球拍"};
		float[] price = {100,200,300};
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]+"\t"+name[i]+"\t"+price[i]);
		}
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(price));
		
	}
	
	public void b() {
		Scanner input = new Scanner(System.in);
		int[] a = new int[5];
		for(int i=0;i<a.length; i++) {
			System.out.print("请输入"+(i+1)+"个成绩:");
			a[i] = input.nextInt();
		}
		
		Arrays.sort(a); //升序排序
		
		for(int e: a) {
			System.out.print(e);
		}
	}
	
	public void c() {
		int[] num = {3,1,2,5,4};
		int max = num[0];
		for(int i=1;i<num.length;i++) {
			if (num[i]>max) {
				max=num[i];
			}
		}
		System.out.println("最大的是：" + max);
		
		Arrays.sort(num);
		System.out.println("最大的是"+num[num.length-1]);
		System.out.println("最小的是"+num[0]);
		
	}
	
	public void d() {
		char[] a = {'a','c','u','b','e','p','f','z'};
		System.out.print("原字符序列：");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		Arrays.sort(a);
		
		System.out.print("升序排序后：");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.print("逆序输出为：" );
		for(int i=a.length-1; i>=0; i--) {
			System.out.print(a[i] + " ");
		}	
	}
	
	public void e() {
		int[] a={1,2,3,4,5,6,7,8,9};
		for (int i=a[0]; i<=a.length; i++) {
			for(int j=a[0]; j<=i; j++) {
				System.out.print(a[j-1] + "*" + a[i-1] + "=" + i*j + " \t");
				
			}
			System.out.println();
		}
		
	}
	
	public void f() {
		Scanner input = new Scanner(System.in);
		int[] a = new int[4];
		System.out.println("请输入四家店的价格");
		for(int i=0; i<a.length; i++) {
			System.out.print("第"+(i+1)+"家店的价格：");
			a[i] = input.nextInt();
		}
		
		Arrays.sort(a);
		
		System.out.println("最低的价格是：" + a[0]);
		
	}
}
