package com.codegnan.arrays;

import java.util.Scanner;

public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int n = sc.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0;i<n;i++){
			sum += a[i];
		}
		System.out.println("sum is "+sum);
	}

}
