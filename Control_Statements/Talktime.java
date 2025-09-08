package com.codegnan.controlstatements;

import java.util.Scanner;

public class Talktime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter talktime");
		int n = sc.nextInt();
		if(n <= 100) {
			System.out.println("basic plan");
		}else {
			if(n>100 && n<=200) {
				System.out.println("Standard");
			}
		}
		
	}

}
