package com.codegnan.oop;

public class CarMain {

	public static void main(String[] args) {
		Car c=new Car();
		c.setModel(" model1");
		c.setYear(2023);
		System.out.println("the model is :"+c.getModel()+" --> and the year is :"+c.getYear());
	}

}