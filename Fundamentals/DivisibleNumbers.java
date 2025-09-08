package com.codegnan.fundamentals;

import java.util.Scanner;

public class DivisibleNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		String r = n%3==0 && n%5!=0 ? "Divisible by 3 and  Not Divisible 5":" ";
		System.out.println(r);
		r = n%3!=0 && n%5==0 ? "Divisible by 5 and  Not Divisible 3":" ";
		System.out.println(r);
		r = n%3==0 && n%5==0 ? "Divisible by 3 and Divisible by 5":" ";
		System.out.println(r);
		r = n%3!=0 && n%5!=0 ? " Not Divisible by 3 and Not Divisible by 5":" ";
		System.out.println(r);
	}

}
