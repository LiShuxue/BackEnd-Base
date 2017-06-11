package 数列之和;
/*
 * 题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...
 * 求出这个数列的前20项之和。 
 */

public class Number {
	public static void main(String[] args) {
		double a =2;
		double b =1;
		double sum =0;
		double t;
		for(int i=1; i<=20; i++) {
			sum=sum+a/b;
			t=b;
			b=a;
			a=a+t;
		}
		System.out.println(sum);
	}
}
