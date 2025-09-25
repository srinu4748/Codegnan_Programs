package com.codegnan.oop.overriding;

import java.util.Scanner;

public class DoctorAppointment extends Appointment{
	public void schedule() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the specilization of doctor: ");
		String s = sc.next();
		System.out.println("schedule appointmet for "+s);
		System.out.println("************************************");
	}
}
