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
		String[] name = {"T��","�˶�Ь","������"};
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
			System.out.print("������"+(i+1)+"���ɼ�:");
			a[i] = input.nextInt();
		}
		
		Arrays.sort(a); //��������
		
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
		System.out.println("�����ǣ�" + max);
		
		Arrays.sort(num);
		System.out.println("������"+num[num.length-1]);
		System.out.println("��С����"+num[0]);
		
	}
	
	public void d() {
		char[] a = {'a','c','u','b','e','p','f','z'};
		System.out.print("ԭ�ַ����У�");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		Arrays.sort(a);
		
		System.out.print("���������");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.print("�������Ϊ��" );
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
		System.out.println("�������ļҵ�ļ۸�");
		for(int i=0; i<a.length; i++) {
			System.out.print("��"+(i+1)+"�ҵ�ļ۸�");
			a[i] = input.nextInt();
		}
		
		Arrays.sort(a);
		
		System.out.println("��͵ļ۸��ǣ�" + a[0]);
		
	}
}
