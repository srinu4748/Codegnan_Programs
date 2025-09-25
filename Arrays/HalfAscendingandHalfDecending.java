package com.codegnan.arrays;

import java.util.Scanner;

public class HalfAscendingandHalfDecending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int n = sc.nextInt();
		int[] a= new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = sc.nextInt();
		}int temp;
		for(int i =0;i<n;i++) {
			for(int j=0;j<n/2;j++) {
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1]= temp;
							
				}
			}
			for(int j = n/2;j<n-1;j++) {
				if(a[j]<a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}

	}

}
