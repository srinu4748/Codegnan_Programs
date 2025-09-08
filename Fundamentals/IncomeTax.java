package com.codegnan.fundamentals;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter Income Tax");
        int n = sc.nextInt();

        double tax = (n < 300000) ? n*0.05 :
                      (n > 300000 && n <1000000)? n*0.10:
                      (n>1000000)? n*0.15:
                       (n>2000000)? n*0.99:n;
        System.out.println("Total tax = " +tax);

	}

}
