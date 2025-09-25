package com.codegnan.oop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box1 = new Box(2.0,3.0,4.0);
		double vol;
		vol = box1.height*box1.width*box1.depth;
		System.out.println(vol);
	}
}
