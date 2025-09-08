package com.codegnan.patterns;

import java.util.Scanner;

public class Diamond {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of rows : ");
	        int n = sc.nextInt();

	        // Upper half
	        for (int i = 1; i <= n; i++) {
	            // Print spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print("  ");
	            }
	            // Print stars
	            for (int j = 1; j <= i * 2 - 1; j++) {
	                System.out.print(" *");
	            }
	            System.out.println();
	        }

	        // Lower half
	        for (int i = n - 1; i > 0; i--) {
	            // Print spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print("  ");
	            }
	            // Print stars
	            for (int j = 1; j <= i * 2 - 1; j++) {
	                System.out.print(" *");
	            }
	            System.out.println();
	        }

	        sc.close();
	    }
}
