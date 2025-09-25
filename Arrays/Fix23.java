package com.codegnan.arrays;

import java.util.Scanner;

public class Fix23 {
	public static int[] fix23(int[] n) {
		if(n[0]==2 && n[1]==3){
			n[1]=0;
		}if(n[1]==2 && n[2]==3) {
			n[2]=0;
		}return n;	
	}
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size :");
		int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = fix23(arr);
        System.out.println("Result after applying fix23:");
		printArray(result);
	}
	
}
