package com.codegnan.fundamentals;

import java.util.Scanner;

public class PostiveorNegative {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int n = sc.nextInt();
		String r = n>=0? "positive": "negative";
		System.out.println(r);

}
}
