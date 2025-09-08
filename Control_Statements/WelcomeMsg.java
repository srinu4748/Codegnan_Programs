package com.codegnan.controlstatements;

import java.util.Scanner;

public class WelcomeMsg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter city name:");
		
		String city = sc.next();
		
		if(city.equalsIgnoreCase("Hyd")) {
			System.out.println("hello hyd...");
		}else {
			if(city.equalsIgnoreCase("banglore")) {
				System.out.println("hello kannadi...");
			}else {
				if(city.equalsIgnoreCase("chennai")) {
					System.out.println("hello madraasi.......");
				}else {
					System.out.println("enter valid city name...");
				}
			}
		}
	}

}
