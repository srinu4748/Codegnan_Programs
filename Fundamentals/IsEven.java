package com.codegnan.fundamentals;
import java.util.Scanner;
public class IsEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int n = sc.nextInt();
		String r = n%2==0? "even": "odd";
		System.out.println(r);
	}

}
