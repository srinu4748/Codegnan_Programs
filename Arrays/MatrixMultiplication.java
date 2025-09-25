package com.codegnan.arrays;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no.of rows  for first matrix");
		int r1 = sc.nextInt();
		System.out.println("enter columns no.of for first matrix");
		int c1 = sc.nextInt();
		System.out.println("enter rows no.of for second matrix");
		int r2 = sc.nextInt();
		System.out.println("enter columns no.of for second matrix");
		int c2 = sc.nextInt();
		
		int[][] a = new int[r1][c1];
		int[][] b = new int [r2][c2];
		int[][] p = new int[r1][c2];
		
		if(c1!=r2) {
			System.out.println("matrix not possible");
		}else {
			System.out.println("enter first matrix");
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c1;j++) {
					a[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("enter second matrix");
			for(int i =0;i<r2;i++) {
				for(int j=0;j<c2;j++) {
					b[i][j] = sc.nextInt();
				}
			}
			
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c2;j++) {
					p[i][j] = 0;
					for(int k =0;k<c1;k++) {
						p[i][j] = a[i][k] * b[k][j];
					}
				}
			}
			System.out.println("matrix multiplication ");
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c2;j++) {
					System.out.print(p[i][j]+" ");
				}
				System.out.println();
			}
		}
				

	}

}
