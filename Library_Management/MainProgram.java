
public class MainProgram {
	public static void main(String[] args) {
		Book book = new Book("gdfuad",5,"praveen");
		DVD dvd = new DVD("jshvfef",6,8);
		book.displayInfo();
		dvd.displayInfo();
		LibraryMember student = new StudentMember(201,"ranjith");
		LibraryMember faculty = new FacultyMember(10,"arun");
		student.borrowItem(book);
		faculty.borrowItem(dvd);
		
		
		
		
	}

}
