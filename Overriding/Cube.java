package com.codegnan.oop.overriding;

import java.util.Scanner;

public class Cube extends Shape {
	public void calculateVolume() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter side of the cube");
		double side  = sc.nextDouble();
		double volume  = side * side * side;
		System.out.printf("volume of cube:%.2f\n ",volume);
	}

}
