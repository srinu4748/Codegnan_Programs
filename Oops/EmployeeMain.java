package com.codegnan.oop;
import java.util.Scanner;
public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("name: ");
        String name = sc.nextLine();

        System.out.println("salary: ");
        double salary = sc.nextDouble();
        Employee1 emp = new Employee1(id, name, salary);

        sc.nextLine();
        System.out.println("\nupdate name: ");
        String newName = sc.nextLine();
        emp.setName(newName);
        System.out.println("update salary: ");
        double newSalary = sc.nextDouble();
        emp.setSalary(newSalary);
        
        System.out.println("\ninitial details:");
        emp.displayEmployeeInfo();
        
        System.out.println("\nafter update details:");
        emp.displayEmployeeInfo();

        sc.close();
    }
}
