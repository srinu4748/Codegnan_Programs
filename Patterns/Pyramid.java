package com.codegnan.patterns;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows");
		int n = sc.nextInt();
		System.out.println("enter columns");
		int m = sc.nextInt();
		for (int i=1; i<=n; i++) 
        { 
            for (int j=n-i; j>=1; j--) {
            	System.out.print(" "); 
            }
            for (int j=1; j<=i; j++) {
            	System.out.print(" *");
            }
            System.out.println(); 
        } 
		

	}

}
