package com.codegnan.patterns;

import java.util.Scanner;

public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows");
		int n = sc.nextInt();
		System.out.println("enter columns");
		int m = sc.nextInt();
		for(int i =1;i<=n;i++) {
			for(int j = 1;j<=m;j++) {
				System.out.print((char)(96+j)+" ");
			}
			System.out.println();
		}
		

	}

}
