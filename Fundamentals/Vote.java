package com.codegnan.fundamentals;
import java.util.Scanner;
public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age :");
		int n = sc.nextInt();
		String r = n>=18? "yes": "no";
		System.out.println(r);
		

	}

}
