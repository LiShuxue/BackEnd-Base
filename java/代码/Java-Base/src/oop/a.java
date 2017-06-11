package oop;

import java.util.Arrays;

public class a {

	public static void main(String[] args) {
		String[][] str = new String[5][6];
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				str[i][j] = "&";
			}
			for(int j=i+1; j<5; j++) {
				str[i][j] = "";
			}
			str[i][5] = "\n";
		}
		String s = Arrays.deepToString(str);
		System.out.println(s);
		
//		String[] arr1 = new String[] { "Fifth", "Sixth" };  
//		String[] arr2 = new String[] { "Seventh", "Eight" };  
//		// 数组的数组  
//		String[][] arrayOfArray = new String[][] { arr1, arr2 };  
//		// 比较下面的输出<br>  
//		System.out.println(arrayOfArray);  
//		System.out.println(Arrays.toString(arrayOfArray)); 
//		System.out.println(Arrays.deepToString(arrayOfArray)); 
	}
}

//class A {
//	public A(int a) {
//		// TODO Auto-generated constructor stub
//	}
//	public void c() {
//		String s = "";
//		s.equ
//	}
//}
//class B extends A{
//	
//}
