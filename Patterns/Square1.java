package com.codegnan.patterns;

import java.util.Scanner;

public class Square1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows");
		int n = sc.nextInt();
		System.out.println("enter columns");
		int m = sc.nextInt();
		for(int i =n;i>=1;i--) {
			for(int j = m;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		

	}

}
