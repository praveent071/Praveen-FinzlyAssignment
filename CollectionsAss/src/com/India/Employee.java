package com.India;

public class Employee {
	private String Name;
	private double salary;
	private int ID;
	
	public Employee(String Name,double salary,int ID) {
		this.Name=Name;
		this.salary=salary;
		this.ID=ID;
		
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getsalary() {
		return salary;
	}

	public void setDomain(String salary) {
		salary = salary;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Domain=" + salary + ", ID=" + ID + "]";
	}
	

}


