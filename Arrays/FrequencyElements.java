package com.codegnan.arrays;

import java.util.Scanner;

public class FrequencyElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter array size");
		int n = sc.nextInt();
		int [] a = new int[n];
		boolean[] v = new boolean[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(v[i] == true) {
				continue;
			}
			int c =1;
			for(int j =i+1;j<n;j++) {
				if(a[i] == a[j]) {
					c++;
					v[j] = true;
				}
			}
			
			//Non frequency elements
			
			if(c==1) {
			System.out.println(a[i]);
			}
		}
	}
	
}


