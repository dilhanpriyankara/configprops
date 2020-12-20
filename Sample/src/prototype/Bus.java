package prototype;

public class Bus extends Vehicle {
	private int noOfseats;

	public int getNoOfseats() {
		return noOfseats;
	}

	public void setNoOfseats(int noOfseats) {
		this.noOfseats = noOfseats;
	}

	@Override
	public String toString() {
		return "Bus [noOfseats=" + noOfseats + "]";
	}
	
	
	
}
