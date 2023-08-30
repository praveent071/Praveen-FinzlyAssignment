package com.India;

public class Bank {
	private String accountnumber;
	private String name;
	private double balance;
	
	public Bank (String name,String accountnumber,double balance) {
		this.name = name;
		this.accountnumber=accountnumber;
		this.balance=balance;
	}

	public String getName() {
		return name;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public double getBalance() {
		return balance;
	}
	public void deposite(double amount) {
		balance+=amount;
	}
	public void withdraw(double amount) {
		if(balance>=amount) {
			balance-=amount;
		}
		else {
			System.out.println("Enter valid amount");
		}
	}

	@Override
	public String toString() {
		return "Bank [accountnumber=" + accountnumber + ", balance=" + balance + "]";
	}

	

}
