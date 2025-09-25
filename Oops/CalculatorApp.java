package com.codegnan.oop;
import java.util.Scanner;
public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        My_Calculation calc = new My_Calculation(a, b);
        System.out.println(calc.addition());
        System.out.println(calc.multiplication());
        sc.close();
    }
}