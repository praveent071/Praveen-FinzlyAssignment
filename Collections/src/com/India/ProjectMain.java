package com.India;

import java.util.HashMap;
import java.util.Scanner;

public class ProjectMain {
	public static void main(String[] args) {
		HashMap<String,Project> List = new HashMap<>();
		Scanner sc =new Scanner(System.in);
		while (true) {
	        System.out.println("1. Add Project");
	        System.out.println("2. Assign Team Member");
	        System.out.println("3. View Project Details");
	        System.out.println("4. List All Projects");
	        System.out.println("5. Exit");
	        int choice = sc.nextInt();
	        
	        switch (choice) {
	        case 1:
	        	String name = sc.next();
	        	String details = sc.next();
	        	Project p1= new Project(name,details);
	        	List.put(name, p1);
	        	break;
	        case 2:
	        	String projectassign = sc.next();
	        	Project p2  =List.get(projectassign);
	        	if(p2 != null) {
	        		String teammembers = sc.next();
	        		p2.addteammember(teammembers);
	        	}
	        	else {
	        		System.out.println("No project ");
	        	}
	        	break;
	        case 3:
	        	String viewproject = sc.next();
	        	Project view = List.get(viewproject);
	        	if(view != null) {
	        		System.out.println(view);
	        	}
	        	else {
	        		System.out.println("No project");
	        	}
	        	break;
	        case 4:
	        	for (Project str : List.values()) {
	        		System.out.println(str);
					
				}
	        	break;
	        case 5:
	        	System.exit(0);
	        	break;
	        default:
	        	System.out.println("please enter valid number");
	        	break;
	        }
		
	}
}
	
        

}
