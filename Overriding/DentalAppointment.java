package com.codegnan.oop.overriding;

import java.util.Scanner;

public class DentalAppointment extends Appointment {
	public void schedule() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the specilization of dentist: ");
		String s1 = sc.nextLine();
		System.out.println("schedule appointmet for "+s1);
		System.out.println("************************************");
	}
}
