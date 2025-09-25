package com.codegnan.oop;

public class Areas {
	static double length, width, radius, side, base, height;
	static double PI = 3.14159;
	public static double rectangleArea() {
	        return length * width;
	    }
	    public static double circleArea() {
	        return PI * radius * radius;
	    }
	    public static double squareArea() {
	        return side * side;
	    }
	    public static double triangleArea() {
	        return 0.5 * base * height;
	    }
	    public static void main(String[] args) {
		    length = 10;
	        width = 5;
	        System.out.println("Rectangle Area: " + rectangleArea());
	
	        radius = 7;
	        System.out.println("Circle Area: " + circleArea());
	
	        side = 4;
	        System.out.println("Square Area: " + squareArea());
	
	        base = 6;
	        height = 8;
	        System.out.println("Triangle Area: " + triangleArea());
	    }

}