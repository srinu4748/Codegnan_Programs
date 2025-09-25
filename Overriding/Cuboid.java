package com.codegnan.oop.overriding;

import java.util.Scanner;

public class Cuboid extends Cube {
	public void calculateVolume() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of the cuboid");
		double length  = sc.nextDouble();
		System.out.println("enter width of cuboid");
		double width = sc.nextDouble();
		System.out.println("enter height of the cuboid");
		double height  =  sc.nextDouble();
		
		double volume = length * width * height;
		System.out.printf("volume od cuboid:%.2f\n ",volume);
	}

}
