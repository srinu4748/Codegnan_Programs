package com.codegnan.fundamentals;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year :");
		int n = sc.nextInt();
		String r = n%4==0 && n%400==0 || n%100!=0? "leap": "non leap";
		System.out.println(r);

	}

}
