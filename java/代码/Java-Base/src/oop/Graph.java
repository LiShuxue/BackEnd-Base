package oop;

public class Graph {
	
	public String tu2(int n, char c) {
		char[] a = new char[n*(n+1)];
		for(int i = 0; i<n; i++){
			for(int j=0; j<=i; j++) {
				a[i*(n+1)+j] = c;
			}
			for(int k=0; k<(n+1)-i-2;k++) {
				a[i*(n+1) + i + 1 +k] = ' ';
			}
			a[i*(n+1)+n] = '\n';
		}
		return new String(a);
	}
}
