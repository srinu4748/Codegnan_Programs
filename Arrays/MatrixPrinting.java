package com.codegnan.arrays;

import java.util.Scanner;

public class MatrixPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows");
		int n = sc.nextInt();
		System.out.println("enter columns");
		int m = sc.nextInt();
		int [][]a = new int[n][m];
		System.out.println("enter  elements");
		for(int i=0;i<n;i++) {
			for(int j =0;j<m;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
