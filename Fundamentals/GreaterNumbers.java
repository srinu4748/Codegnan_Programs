package com.codegnan.fundamentals;

import java.util.Scanner;

public class GreaterNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number:");
		int n = sc.nextInt();
		
		System.out.println("enter second number:");
		int m = sc.nextInt();
		
		 String r = n>m? "first number is gratee": "second number is grater";
		System.out.println(r);
		

	}

}
