package com.codegnan.oop;

public class MethodsBank {
	static int currentBal = 1000;
	public static void greetings() {
		System.out.println("welcome to the bank");
	}
	public void deposit(int amount) {
		currentBal += amount;
		System.out.println("amount deposited successfully");
	}
	public static void  withdrawal(int amount) {
		currentBal -= amount;
		System.out.println("amount withdeawal successfully");
	}
	public int  getBalance() {
		return currentBal;
	}
	public static void main(String[] args) {
		MethodsBank  methodsbank = new MethodsBank();
		greetings();
		System.out.println("current balance is - "+methodsbank.getBalance());
		methodsbank.deposit(500);
		System.out.println("current balance is - "+methodsbank.getBalance());
		withdrawal(200);
		System.out.println("current balance is - "+methodsbank.getBalance());
		
	}
}