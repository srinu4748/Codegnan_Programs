package com.codegnan.oop.overriding;

public class AppointmentMAin {

	public static void main(String[] args) {
		Appointment s = new Appointment();
		s.schedule();
		DoctorAppointment d1 = new DoctorAppointment();
		d1.schedule();
		DentalAppointment d2 = new DentalAppointment();
		d2.schedule();
		

	}

}
