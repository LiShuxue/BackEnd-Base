package ��С�������������;

import java.util.Scanner;
/*
 * ��Ŀ��������������x,y,z���������������С���������   
 */
public class Digit {
	public static void main(String[] args) {
		System.out.print("�����һ������");
		Scanner input1 = new Scanner(System.in);
		double x = input1.nextDouble();
		System.out.print("����ڶ�������");
		Scanner input2 = new Scanner(System.in);
		double y = input2.nextDouble();
		System.out.print("�������������");
		Scanner input3 = new Scanner(System.in);
		double z = input3.nextDouble();
		
//		if (x>y){
//			if(y>z){
//				System.out.println("��С����" +z+ "  " +y+ "  " +x);
//			}
//			else{
//				if(x>z){
//					System.out.println("��С����" +y+ "  " +z+ "  " +x);
//				}
//				else {
//					System.out.println("��С����" +y+ "  " +x+ "  " +z);
//				}
//			}
//		}
//		
//		else{
//			if(y<z){
//				System.out.println("��С����" +x+ "  " +y+ "  " +z);
//			}
//			else{
//				if(x>z){
//					System.out.println("��С����" +z+ "  " +x+ "  " +y);
//				}
//				else {
//					System.out.println("��С����" +x+ "  " +z+ "  " +y);
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
		System.out.println("��С����" +x+ "  " +y+ "  " +z);
	}
}
