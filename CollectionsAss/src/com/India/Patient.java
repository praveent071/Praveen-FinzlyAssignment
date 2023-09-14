package com.India;

public class Patient {
	private String name;
	private int age;
	private int ID;
	public Patient(String name,int age,int ID) {
		this.age=age;
		this.ID=ID;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getID() {
		return ID;
	}
	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", ID=" + ID + "]";
	}
	

}
