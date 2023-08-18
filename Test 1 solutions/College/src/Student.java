
public class Student {
	private int studentID;
	private String name;
	static int totalstudent = 0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getTotalstudent() {
		return totalstudent;
	}
	public static void setTotalstudent(int totalstudent) {
		Student.totalstudent = totalstudent;
	}
	public void enroll(String name) {
		System.out.println("Total students enrolled " +name);
		totalstudent ++;
	}
	public void drop(String name) {
		System.out.println("Total students droped " + name);
		totalstudent --;
	}
	public static int returntotal() {
		return totalstudent;
	}
	public static void main(String[] args) {
		Student number = new Student();
		number.enroll("praveen");
		number.enroll("sarvesh");
		System.out.println("Total students added " + number.returntotal());
		number.drop("sarvesh");
		System.out.println("Total students droped " + number.returntotal());
		
	}

}
