
public class FacultyMember extends LibraryMember {

	public FacultyMember(int memberID, String name) {
		super(memberID, name);
		
	}
	@Override
	public void borrowItem(LibraryItem item) {
		System.out.println("Faculty "+getName()+ " borrowing " + item.getTitle());
	}

}
