package prototype;

public class Application {
	public static void main(String[] args) {
		Registry registry=new Registry();
		
		Car car=(Car) registry.getVehicle("car");
		
		System.out.println(car);
		
		car.setType("luxuri");
		System.out.println(car);
		
		Car car2=(Car) registry.getVehicle("car");
		System.out.println(car2);
	}
}
