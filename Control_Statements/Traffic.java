package com.codegnan.controlstatements;

import java.util.Scanner;

public class Traffic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows");
		int r = sc.nextInt();
		
		System.out.println("enter columns");
		int c = sc.nextInt();
		
		int[][] m = new int[r][c];
		
		System.out.println("enter 2D elements");
		for(int i =0;i<r;i++) {
			for(int j= 0;j<c;j++) {
				m[i][j] =sc.nextInt();
			}
		}
		
		System.out.println("printing entered elements");
		for(int i =0;i<r;i++) {
			for(int j= 0;j<c;j++) {
				System.out.print(m[i][j]+" ");
			}
		}
		System.out.println("\n");

				
		
	}

}
