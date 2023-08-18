
class Room {
	private int roomnumber;
	private int capacity;
	private double pricepernight;
	public boolean reserved = true;
	public int getRoomnumber() {
		return roomnumber;
	}
	public void setRoomnumber(int roomnumber) {
		this.roomnumber = roomnumber;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public double getPricepernight() {
		return pricepernight;
	}
	public void setPricepernight(double pricepernight) {
		this.pricepernight = pricepernight;
	}
	
	public boolean availability() {
		return reserved;
	}
	public void reservation() {
		if(reserved) {
			System.out.println("Successfully reserved");
		}
		else {
			System.out.println("Already reserved");
		}
	}
	public void reservation(String checkin,String checkout) {
		if(reserved) {
			System.out.print(checkin + " Successfully reserved " + checkout);
		}
		else {
			System.out.println("Already reserved");
		}
	}
 	@Override
	public String toString() {
		return "Room " + roomnumber + " capacity pre room " +capacity+ " price for the room " + pricepernight;
	}
	public static void main(String[] args) {
		Room r = new Room();
		r.setCapacity(4);
		r.setPricepernight(1000);
		r.setRoomnumber(101);
		if(r.availability()) {
			r.reservation();
			r.reservation("12/01/2023","13/01/2023");
		}
		System.out.println();
		System.out.println(r.toString());
		r.toString();
		
	}
	

}
