package com.codegnan.arrays;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows");
		int n = sc.nextInt();
		System.out.println("enter columns");
		int m = sc.nextInt();
		int [][]a = new int[n][m];
		int [][]b = new int[n][m];
		int [][]sum = new int[n][m];
		System.out.println("enter first matrix");
		for(int i =0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("enter second matrix");
		for(int i=0;i<n;i++) {
			for(int j =0;j<m;j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		for(int i =0;i<n;i++) {
			for(int j=0;j<m;j++) {
				sum[i][j] =a[i][j] + b[i][j];
			}
		}
		System.out.println("matrix sum is :");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(sum[i][j]+" ");
				
			}
			System.out.println();
		}
		

	}

}
