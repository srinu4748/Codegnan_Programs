package com.codegnan.arrays;

import java.util.Scanner;

public class ReverseofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i =n-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}

	}

}
