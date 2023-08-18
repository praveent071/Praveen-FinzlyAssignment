
class DVD extends LibraryItem{
	private int duration;

	public DVD(String title, int itemID,int duration) {
		super(title, itemID);
		this.duration = duration;
		
	}
	
	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Duration  "+ duration);

	}

}
