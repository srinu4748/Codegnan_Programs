package com.codegnan.controlstatements;
import java.util.Scanner;
public class Amstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l=0,m;
		int t = n;
		double a=0;
		int temp = n;
		while(temp!=0) {
			m=temp%10;
			l++;
			temp = temp/10;
		}
		temp = n;
		while(temp>0) {
			m = temp%10;
			a = a + Math.pow(m,l);
			temp=temp/10;
		}
		if(a == n) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
