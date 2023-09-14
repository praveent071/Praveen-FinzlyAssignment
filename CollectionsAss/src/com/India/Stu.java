package com.India;

public class Stu extends School{
	int ID;
	Stu(String Name, int Age,int ID){
		super(Name,Age);
		this.ID=ID;
	}
	@Override
	public String toString() {
		return "Stu [ID=" + ID + ", Name=" + Name + ", Age=" + Age + "]";
	}
	 
	
	

}
class Teacher extends School{
	private int Eid;

	public Teacher(String Name, int Age,int Eid ) {
		super(Name, Age);
		this.Eid=Eid;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Teacher [Eid=" + Eid + ", Name=" + Name + ", Age=" + Age + "]";
	}

	
	
}
