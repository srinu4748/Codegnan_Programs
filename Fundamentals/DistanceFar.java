package com.codegnan.fundamentals;

import java.util.Scanner;

public class DistanceFar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter distance in km:");
        int n = sc.nextInt();

        double fare = (n <= 2) ? 50 :
                      (n <= 10) ? (50 + (n - 2) * 15) :
                      (n <= 20) ? (50 + (8 * 15) + (n - 10) * 10) :
                      (50 + (8 * 15) + (n - 10) * 10) * 0.95;

        System.out.println("Total fare = " + fare);
    }
}
