package com.codegnan.controlstatements;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt();
		int temp = n;
		int m,s=0;
		while(n>0) {
			m = n%10;
			s = s*10+ m;
			n = n/10;
		}
		if(temp == s) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
		

	}

}
