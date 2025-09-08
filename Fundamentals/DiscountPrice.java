package com.codegnan.fundamentals;

import java.util.Scanner;

public class DiscountPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Price");
		int n = sc.nextInt();
		
		double  tot  =(n>=100) ? (n - (n*0.2)):((n>=50 && n<100)?(n - (n*0.1)):n);
		System.out.println(tot);
		
		

	}

}
