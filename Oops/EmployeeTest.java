package com.codegnan.oop;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setDetails("neha",3000);
		System.out.println(" employee name  is : "+emp.name);
		System.out.println(" employee basic salary  is : "+emp.basicSalary);
		System.out.println(" HRA is : "+emp.calculateHRA());
		System.out.println(" DA is : "+emp.calculateDA());
		System.out.println(" Gross Salary is : "+emp.calculateGrossSalary());
	}

}
