package com.codegnan.controlstatements;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt();
		int m,rev=0;
		if(n<0){
			 n=-n;
	    }
		while(n!=0) {
			m = n%10;
			rev = rev*10+ m;
			n = n/10;
		}
		System.out.println(rev);
	}

}
