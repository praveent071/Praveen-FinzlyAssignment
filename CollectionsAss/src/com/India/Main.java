package com.India;

import java.util.ArrayList;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		 HashMap<Integer, Employee> List = new HashMap<>();
	    Scanner sc = new Scanner(System.in);
	    while (true) {
	       
	        System.out.println("1. Add Employee");
	        System.out.println("2. View Employee Details");
	        System.out.println("3. Search Employee by ID");
	        System.out.println("4. Exit");
	        int choice = sc.nextInt();
	        switch(choice) {
	        case 1:
	        	String Name =sc.next();
	        	double salary =sc.nextDouble();
	        	int ID = sc.nextInt();
	        	Employee E = new Employee(Name,salary,ID);
	        	List.put(ID, E);
	        	break;
	        case 2:
	        	for(Employee string : List.values()) {
	        		System.out.println(string);
					
				}
	        	break;
	        case 3:
	        	int id = sc.nextInt();
	        	Employee get = List.get(id);
	        	if(get!=null) {
	        		System.out.println(get);
	        		
	        	}
	        	else {
	        		System.out.println("invalid");
	        	}
	        	break;
	        case 4:
	        	System.exit(0);
	        	break;
	        default:
	        	System.out.println("enter valid number");
	        	break;
	        	
	        	

	       }

		
	}
}
	
		


	

}
