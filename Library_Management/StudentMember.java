
 class StudentMember extends LibraryMember {

	public StudentMember(int memberID, String name) {
		super(memberID, name);
		
	}
	@Override
	public void borrowItem(LibraryItem item) {
		System.out.println("student " + getName() +" borrowing "+item.getTitle());
		
	}
	

}
