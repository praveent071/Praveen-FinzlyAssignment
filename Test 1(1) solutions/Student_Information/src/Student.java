import java.util.*;
public class Student {
	private String name;
	private int age;
	private int studentId;
	private static int studentId1 = 0;
	public Student() {
		this("unknown",0);
			}
	public Student(String name,int age){
		this(name,age,studentId1);
		studentId1++;
	}
	public Student(String name,int age,int studentId) {
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
	public void show() {
		System.out.println("Name of the student " +name);
		System.out.println("Age of the student "+age);
		System.out.println("Student Id " +studentId);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student info = new Student();
		System.out.println("Name ");
		String name = sc.nextLine();
		System.out.println("Age ");
		int age = sc.nextInt();
		Student info1 = new Student(name,age);
		info.show();
		info1.show();
				
;	}

}
