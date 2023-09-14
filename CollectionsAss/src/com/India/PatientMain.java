package com.India;

import java.util.HashMap;
import java.util.Scanner;

public class PatientMain {
	public static void main(String[] args) {
		HashMap<Integer,Patient> List = new HashMap<>();
		Scanner sc =new Scanner(System.in);
		boolean m= true;
		while(m) {
			System.out.println("1. Add Patient");
            System.out.println("2. View Patient Details");
            System.out.println("3. Search Patient by ID");
            System.out.println("4. List All Patients");
            System.out.println("5. Exit");
            int choice = sc.nextInt();
        
            switch(choice) {
            case 1:
            	String name = sc.next();
            	int age = sc.nextInt();
            	int ID = sc.nextInt();
            	List.put(ID, new Patient(name,age,ID));
            	break;
            case 2:
            	int viewId = sc.nextInt();
                Patient patient = List.get(viewId);
                if (patient != null) {
                    System.out.println(patient);
                } else {
                    System.out.println("Patient not found.");
                }
                break;
            case 3:
            	 int searchId = sc.nextInt();
                 patient = List.get(searchId);
                 if (patient != null) {
                     System.out.println(patient);
                 } else {
                     System.out.println("Patient not found.");
                 }
                 break;
            case 4:
            	for (Patient dis : List.values()) {
            		System.out.println(dis);
					
				}
            	break;
            case 5:
            	m =false;
            	break;
            default:
            	System.out.println("Enter valid number");
            	break;
            	
            }
        
            	
		}
		
	}
	
	
	
}
