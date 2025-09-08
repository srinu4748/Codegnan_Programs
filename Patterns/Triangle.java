package com.codegnan.patterns;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows");
		int n = sc.nextInt();
		System.out.println("enter columns");
		int m = sc.nextInt();
		for(int i =n;i>=1;i--) {
			for(int j = m;j>=i;j--) {
				System.out.print((char)(96+j)+" ");
			}
			System.out.println();
		}
		

	}

}
