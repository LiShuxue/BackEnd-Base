package 完全平方数;
/*
 * 题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少    
 * 完全平方数：一个数可以表示成某个数的平方，如4.9.16.25.36.49....
 */

public class Digit {
	public static void main(String[] args) {
		for (int i=0; i<10000; i++) {
			if (Math.sqrt(i+100) % 1==0) {
				if (Math.sqrt(i+168) % 1==0) {
					System.out.println("这个数是：" + i);
					
				}			
			}
		}	
	}
}
