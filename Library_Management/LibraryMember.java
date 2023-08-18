
 abstract class LibraryMember {
	private int memberID;
	private String name;
	public LibraryMember(int memberID,String name) {
		this.memberID = memberID;
		this.name = name;
	}
	
   
public int getMemberID() {
	return memberID;
}

public String getName() {
	return name;
}
public abstract void borrowItem(LibraryItem item) ;

 

}
