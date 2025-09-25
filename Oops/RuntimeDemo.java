package com.codegnan.oop;

import java.util.Date;

public class RuntimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r = Runtime.getRuntime();
		System.out.println("total memoty of heap "+r.totalMemory());
		System.out.println("free memory "+r.freeMemory());
		long opm = r.totalMemory()-r.freeMemory();
		System.out.println("occupied memory "+opm);
		
		for(int i=0;i<1000000000;i++) {
			Date d = new Date();
		}
		System.out.println("free memory "+r.freeMemory());
		System.out.println("total memoty of heap "+r.totalMemory());
		r.gc();
		 
		System.out.println("free memory "+r.freeMemory());
		long opm1 = r.totalMemory()-r.freeMemory();
		System.out.println("occupied memory "+opm1);
		

	}

}
