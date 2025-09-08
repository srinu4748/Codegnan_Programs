package com.codegnan.controlstatements;
import java.util.Scanner;
public class Table {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		for(int i=20;i>=1;i--) {
			System.out.println(n+"*"+i+"="+n*i);
		}

	}

}
