package com.codegnan.oop.overriding;

public class Rectangle extends Figure{
	public Rectangle(double a , double b) {
		super(a, b);
	}
	
	public double area() {
		System.out.println("inside area is rectangle");
		return d1 * d2;
	}
}
