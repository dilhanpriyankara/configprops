package prototype;

public abstract class Vehicle implements Cloneable{
	private String fueltype;
	private Integer enginecapasity;
	
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	
	public Integer getEnginecapasity() {
		return enginecapasity;
	}
	public void setEnginecapasity(Integer enginecapasity) {
		this.enginecapasity = enginecapasity;
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {		
		return super.clone();
	}
}
