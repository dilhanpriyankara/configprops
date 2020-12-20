package prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	
	private Map<String, Vehicle> vehiclemap=new HashMap();
	
	public Registry() {
		this.initialize();
	}

	private void initialize() {
		Car car=new Car();
		car.setEnginecapasity(1000);
		car.setFueltype("petrol");
		car.setType("mini");
		
		Bus bus=new Bus();
		bus.setEnginecapasity(1500);
		bus.setFueltype("deisel");
		bus.setNoOfseats(25);
		
		vehiclemap.put("car", car);
		vehiclemap.put("bus", bus);		
		
	}
	
	public Vehicle getVehicle(String vehicletype) {
		Vehicle vehicle=null;
		try {
			 vehicle=(Vehicle) vehiclemap.get(vehicletype).clone();
		} catch (CloneNotSupportedException e) {			
			e.printStackTrace();
		}
		
		return vehicle;
		
	}
	

}
