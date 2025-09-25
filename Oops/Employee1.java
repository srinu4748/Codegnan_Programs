package com.codegnan.oop;

public class Employee1 {
    private int employeeId;
    private String name;
    private double salary;
    public Employee1(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        setSalary(salary);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive. Setting to default 0.");
            this.salary = 0;
        }
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
