package com.codegnan.oop.overriding;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p1 = new Parent();
		p1.property();
		p1.marry();
		
		Child c1 = new Child();
		c1.marry();
		
		Parent p2 = new Child();
		p2.property();
		p2.marry();

	}

}
