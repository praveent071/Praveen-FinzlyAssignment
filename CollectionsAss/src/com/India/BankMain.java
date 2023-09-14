package com.India;

import java.util.ArrayList;
import java.util.Scanner;

public class BankMain {
	 
	
	public static void main(String[] args) {
		ArrayList<Bank> List = new ArrayList<>();
	     Scanner sc = new Scanner(System.in);
		while(true) {
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Check Balance");
            System.out.println("5. List All Accounts");
            System.out.println("6. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    String name = sc.next();
                    String accountnumber = sc.next();
                    double balance = sc.nextDouble();
                    Bank b1 =new Bank(name,accountnumber,balance);
                    List.add(b1);
                    break;
                case 2:
                	String accountnumber1 = sc.next();
                	double amount = sc.nextDouble();
                	for (Bank bank : List) {
                		if(bank.getAccountnumber().equals(accountnumber1)) {
                			bank.deposite(amount);
                			break;
                		}
						
					}
                 
                    break;
                case 3:
                	String accountnumber2 = sc.next();
                	double amount1 = sc.nextDouble();
                	for (Bank bank : List) {
                		if(bank.getAccountnumber().equals(accountnumber2)) {
                			bank.withdraw(amount1);
                			break;
                		}
					}
                    break;
                case 4:
                	String accountnumber3 = sc.next();
                	for (Bank bank : List) {
                		if(bank.getAccountnumber().equals(accountnumber3)) {
                			bank.getBalance();
                			break;
                		}
					}
                    break;
                case 5:
                	for (Bank bank : List) {
                		System.out.println(bank.getAccountnumber());
                		System.out.println(bank.getBalance());
                		System.out.println(bank.getBalance());
                	}
                	
                 
                    break;
                case 6:
                
                    System.exit(0);
                default:
                    System.out.println("Invalid number");
            }
        }
	}
	
}

			
		
	


