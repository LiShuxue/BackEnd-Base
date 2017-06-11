package 回文数;

import java.util.Scanner;

/*
 * 题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。 
 */
public class Digit {
	public static void main(String[] args) {
		boolean c=false;
		System.out.print("请输入一个数：");
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		char[] b = a.toCharArray();
		
		if(b.length==1) {
			System.out.println(a + "不是回文数");
		}
		else{
			for(int i=0; i<b.length/2; i++) {
				if(b[i]==b[b.length-1-i]){
					c = true;
					continue;
				}
				else{
					c=false;
				}
			}
			if(c){
				System.out.println(a + "是回文数");
			}
			else {
				System.out.println(a + "不是回文数");
			}
		}
		
	}
}
