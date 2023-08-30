
public class State {
	private String District;
	private int Pincode;
	public State(String District,int Pincode) {
		this.District=District;
		this.Pincode=Pincode;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	@Override
	public String toString() {
		return "State [District=" + District + ", Pincode=" + Pincode + "]";
	}
	

}
