package oop;

import java.io.IOException;
import java.util.Scanner;

public class GraphTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Graph g = new Graph();
		
		System.out.print("������������");
		int n = input.nextInt();
		System.out.print("������ͼ�Σ�");
		char c = 0;
		try {
			c = (char)System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(g.tu2(n, c));	
	}
}
