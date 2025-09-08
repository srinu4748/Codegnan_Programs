package com.codegnan.fundamentals;
import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Principal Amount:");
		int p = sc.nextInt();
		
		System.out.println("Enter Time in years:");
		double t = sc.nextDouble();
		
		
		
		System.out.println("Enter Rate of Interest:");
		double r = sc.nextDouble();
		
		double total =(p*t*r)/100;
		System.out.println("Total Amount is :"+total);
	}

}
