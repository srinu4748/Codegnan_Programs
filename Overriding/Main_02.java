package com.codegnan.oop.overriding;

public class Main_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figure f = new Figure(10,10);
		Rectangle r = new Rectangle(20,20);
		Triangle t = new Triangle(30,30);
		System.out.println(f.area());
		f =r;
		System.out.println(f.area());
		
		f = t;
		System.out.println(f.area());
		

	}

}
