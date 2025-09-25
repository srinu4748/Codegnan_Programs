package com.codegnan.oop;
import java.util.Scanner;

class Student {
    String name;
    int[] marks;
    void setDetails(String n, int[] m) {
        name = n;
        marks = m;
    }
    int calculateTotal() {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return total;
    }
    double calculateAverage() {
        return (double) calculateTotal() / marks.length;
    }
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.print("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println("\nTotal: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
    }
}
public class StudentMarks {
    public static void main(String[] args) {
        Student s1 = new Student();
        String studentName = "Srinu";
        int[] marksArray = {85, 90, 78, 88, 92};
        s1.setDetails(studentName, marksArray);
        s1.displayDetails();
    }
}
