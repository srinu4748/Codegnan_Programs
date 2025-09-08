package com.codegnan.fundamentals;

import java.util.Scanner;

public class StudentPass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter marks:");
		int m = sc.nextInt();
		
		String p =m>100?"Invalid Marks":m>=90?"O":m>=80?"S":m>=70?"A":m>=60?"B":m>=50?"C":m>=40?"D":"F";
		System.out.println(p);
		sc.close();
		

	}

}
