package 字符串长度和逆序;

import java.util.Scanner;

/*
 * 题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。 
 */
public class Length {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个不多于五位的正整数：");
		String a = input.nextLine();
		int b = a.length();
		System.out.println("它是"+b+"位数");
		char[] ch= a.toCharArray();
		System.out.print("它的逆序是：");
		for(int i=ch.length-1; i>=0; i--) {
			System.out.print(ch[i]);
		}
	}
}
