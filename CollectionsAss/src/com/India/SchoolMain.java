package com.India;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolMain {
	static ArrayList<School> List = new ArrayList<>();
	static ArrayList<School> List2 = new ArrayList<>();

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			System.out.println("1-Add Students");
			System.out.println("2-Add Teacher");
			System.out.println("3-Display Students");
			System.out.println("4-Display Teacher");
			System.out.println("Exit");
			
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				String StudentName = sc.next();
				int StudentAge = sc.nextInt();
				int ID =sc.nextInt();
				List.add(new Stu(StudentName,StudentAge,ID));
				
				break;
			case 2:
				String TeacherName= sc.next();
				int TeacherAge = sc.nextInt();
				int Eid = sc.nextInt();
				List2.add(new Teacher(TeacherName,TeacherAge,Eid));
				break;
			case 3:
				for (School school : List) {
					System.out.println(school);
				}
				break;
			case 4:
				for (School school : List2) {
					System.out.println(school);
				}
				break;
			case 5:
				System.exit(0);
				break;
			default:
                 System.out.println("Invalid choice. ");
                 break;
			}
			
		}
	}
	

}
