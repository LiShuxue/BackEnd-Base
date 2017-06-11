package oop;

public class b {
	public static void main(String[] args) {
		char[] a = new char[12];
		for(int i = 0; i<3; i++){
			for(int j=0; j<=i; j++) {
				a[i*4+j] = '&';
			}
			for(int k=0; k<4-i-2;k++) {
				a[i*4 + i + 1 +k] = ' ';
			}
			a[i*4+3] = '\n';
		}
		System.out.println(new String(a));
	}
}
