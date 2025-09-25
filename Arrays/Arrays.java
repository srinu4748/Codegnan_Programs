package com.codegnan.arrays;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int n = sc.nextInt();
		System.out.println("enter ");
		
		int a[][] = new int[n];
		System.out.println("enter array elements");
		
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("print array elements");
		
		for(int i= 0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
