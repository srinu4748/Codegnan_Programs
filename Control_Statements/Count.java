package com.codegnan.controlstatements;
import java.util.Scanner;
public class Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		int c =0,m;
		while(n>0) {
			m = n%10;
			c++;
			n = n/10;
		}
		System.out.println(c);
		
	}
}
