package com.codegnan.oop;
import java.util.Scanner;

class EmployeeInfo extends Employee_01 {
    double salaryPerYear;

    public EmployeeInfo() {
        super("", "", 0);
    }

    public void inputEmployeeDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        employeeName = sc.nextLine();
        System.out.print("Enter employee designation: ");
        designation = sc.nextLine();
        System.out.print("Enter years of experience: ");
        yearOfExperience = sc.nextInt();
        System.out.print("Enter yearly salary: ");
        salaryPerYear = sc.nextDouble();
        sc.close();
    }

    public void displayEmployeeInfo() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Designation: " + designation);
        System.out.println("Years of Experience: " + yearOfExperience);
    }

    public void calculateSalary() {
        double salary = salaryPerYear * yearOfExperience;
        System.out.println("Total Salary: " + salary);
    }
}