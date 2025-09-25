package com.codegnan.oop.overriding;

public class Triangle extends Figure {
	public Triangle(double a , double b) {
		super(a, b);
	}
	public double area() {
		System.out.println("inside area triangle is present");
		return  (d1*d2)*0.5;
	}
}
