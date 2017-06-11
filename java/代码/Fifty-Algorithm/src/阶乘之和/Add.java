package 阶乘之和;
/*
 * 题目：求1+2!+3!+...+20!的和  
 */
public class Add {

	public static void main(String[] args) {
		long sum=0;
		long mul=1;
		for(int i=1; i<=20; i++) {
			mul=1;
			for(int j=i; j>=1; j--) {	
				mul = mul*j;
			}
			sum = sum+mul;
		}
		System.out.println(sum);
//	    long sum = 0; 
//	    long fac = 1;
//	    for(int i=1; i<=20; i++) {
//	     fac = fac * i;
//	     sum += fac;
//	    }
//	    System.out.println(sum);
	}
}
