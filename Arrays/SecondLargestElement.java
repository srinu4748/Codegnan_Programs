package com.codegnan.arrays;

import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int max1 = a[0];
		for(int i=0;i<n;i++) {
			if(a[i]>max1) {
				max1 = a[i];
			}
		}
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(a[i]!=max1 && a[i]>max) {
				max= a[i];
			}
		}
		System.out.println("second largest element : "+max);
	}

}
