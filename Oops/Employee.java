package com.codegnan.oop;

public class Employee {
	String name;
	double basicSalary;

	public void setDetails(String n, double salary) {
		this.name = n;
		this.basicSalary = salary;
		
	}
	public double calculateHRA() {
		return basicSalary * 0.20;
	}
	
	public double calculateDA() {
		return 0.10* basicSalary;
	}
	
	public double calculateGrossSalary() {
		return basicSalary + calculateHRA() + calculateDA();
	}
}
