package com.codegnan.controlstatements;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks:");
		int m = sc.nextInt();
		if(m>=90) {
			System.out.println("o");
		}else {
			if(m>=80) {
				System.out.println("s");
			}else {
				if(m>=70) {
					System.out.println("a");
				}else {
					if(m>=60) {
						System.out.println("b");
					}else {
						if(m>=50) {
							System.out.println("c");
						}else{
							if(m>40) {
								System.out.println("d");
							}else {
								System.out.println("f");
							}
						}
					}
				}
			}
		}

	}

}
