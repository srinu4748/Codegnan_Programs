package com.codegnan.controlstatements;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double bal = 60000;
		int pin = 1234;
		System.out.println("enter pin");
		int epin = sc.nextInt();
		if(epin!= pin) {
			System.out.println("invalid pin");
		}else {
		int c;
		do {
			System.out.println("===========================");
			System.out.println("====Atm menu====");
			System.out.println("====1.check bal====");
			System.out.println("====2.deposite====");
			System.out.println("====3.withdraw====");
			System.out.println("====4.exit====");
			System.out.println("===========================");
			System.out.println("enter your choice");
			c=sc.nextInt();
			switch(c) {
			case 1:
				System.out.println(bal);
				break;
			case 2:
				System.out.println("enter deposite amount");
				double da = sc.nextDouble();
				if(da%100!=0) {
					System.out.println("deposite multiples of 100");
				}else {
					if(da < 500) {
						System.out.println("deposite more than 500 ");
					}else {
						bal+=da;
						System.out.println(bal);
					}
				}
				break;
			case 3:
				System.out.println("enter withdraw amount");
				
				double wa = sc.nextDouble();
				if(wa%100!=0) {
					System.out.println("deposite multiples of 100");
				}else {
					if(wa < 500) {
						System.out.println("deposite more than 500 ");
					}else {
						if(wa <= bal) {
							bal-=wa;
							System.out.println(bal);
						}else {
							System.out.println("insufficient bal");
						}
					}
				}
			case 4:
				System.out.println("exit");
				break;
				default:
					System.out.println("choose valid option 1-4");
					break;
			}
		}while(c!=4);
		}
		sc.close();
	}

}
