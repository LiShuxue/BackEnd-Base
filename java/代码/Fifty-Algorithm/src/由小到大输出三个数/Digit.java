package 由小到大输出三个数;

import java.util.Scanner;
/*
 * 题目：输入三个整数x,y,z，请把这三个数由小到大输出。   
 */
public class Digit {
	public static void main(String[] args) {
		System.out.print("输入第一个数：");
		Scanner input1 = new Scanner(System.in);
		double x = input1.nextDouble();
		System.out.print("输入第二个数：");
		Scanner input2 = new Scanner(System.in);
		double y = input2.nextDouble();
		System.out.print("输入第三个数：");
		Scanner input3 = new Scanner(System.in);
		double z = input3.nextDouble();
		
//		if (x>y){
//			if(y>z){
//				System.out.println("由小到大：" +z+ "  " +y+ "  " +x);
//			}
//			else{
//				if(x>z){
//					System.out.println("由小到大：" +y+ "  " +z+ "  " +x);
//				}
//				else {
//					System.out.println("由小到大：" +y+ "  " +x+ "  " +z);
//				}
//			}
//		}
//		
//		else{
//			if(y<z){
//				System.out.println("由小到大：" +x+ "  " +y+ "  " +z);
//			}
//			else{
//				if(x>z){
//					System.out.println("由小到大：" +z+ "  " +x+ "  " +y);
//				}
//				else {
//					System.out.println("由小到大：" +x+ "  " +z+ "  " +y);
//				}
//			}
//		}
		
		if(x > y) {
		      double t = x;
		      x = y;
		      y = t;
		     }
		    if(x > z) {
		      double t = x;
		      x = z;
		      z = t;
		     }
		    if(y > z) {
		      double t = y;
		      y = z;
		      z = t;
		     }
		System.out.println("由小到大：" +x+ "  " +y+ "  " +z);
	}
}
