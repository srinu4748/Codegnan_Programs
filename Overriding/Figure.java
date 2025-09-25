package com.codegnan.oop.overriding;

public class Figure {
	double d1;
	double d2;
	public Figure(double d1, double d2) {
		super();
		this.d1 = d1;
		this.d2 = d2;
	}
	public double area() {
		System.out.println("area for figure is undefined");
		return 0;
	}
}
