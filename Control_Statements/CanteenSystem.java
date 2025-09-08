package com.codegnan.controlstatements;

import java.util.Scanner;

public class CanteenSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO OUR CODEGNAN CANTEEN !!");
		int choice;
		int teaamount=0,coffeeamount=0,samosaamount=0;
		int amount;
		double totalamount;
		
		
		do {
			System.out.println("|====lets Start the proces=====|");
			System.out.println("1.View the menu");
			System.out.println("2.order items");
			System.out.println("3.View the bill");
			System.out.println("4.Exit");
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			switch(choice) {
			
			
			case 1:
				
				System.out.println("|=====Menu card=====|");
				System.out.println("1.Tea(1)     ==>$10");
				System.out.println("2.Coffee(1)  ==>$15");
				System.out.println("3.Samosa(1)  ==>$20");
				System.out.println("");
				break;
				
				
			case 2:
				int ch;
				do {
				System.out.println("enter the item number(1,2,3) and 4 for stop ordering: ");
				ch=sc.nextInt();
				switch(ch) {
				case 1:
					System.out.println("enter the quantity of Tea: ");
					int tea=sc.nextInt();
					teaamount=tea*10;
					break;
				case 2:
					System.out.println("enter the quantity of Coffee: ");
					int coffee=sc.nextInt();
					coffeeamount=coffee*15;
					break;
				case 3:
					System.out.println("enter the quantity of Samosa: ");
					int samosa=sc.nextInt();
					samosaamount=samosa*20;
					break;
				case 4:
					System.out.println("THANK YOU FOR ORDERING!! CLICK 3 TO GENERATE BILL");
					break;
				default:
					System.out.println("enter the valid item number ");
				
				}					
				}while(ch!=4);
				break;
				
				
			case 3:
				System.out.println("your bill for the orer is: ");
				System.out.println("tea amount      :"+teaamount);
				System.out.println("cofee amount    :"+coffeeamount);
				System.out.println("samosa amount   :"+samosaamount);
				amount=teaamount+samosaamount+coffeeamount;
				totalamount=amount+amount*(0.05);
				System.out.println("GST APPLIED(5%) :"+amount*(0.05));
				System.out.println("Total amount ===>"+totalamount);
				break;
				
				
			case 4:
				System.out.println("THANK YOU FOR VISITING OUR CANTEEN!!");
				break;
				
				
			default:
				System.out.println("enter the correct option(1,2,3,4) ");
			
				
			}
		
		}while(choice!=4);
		
		sc.close();
	}

}