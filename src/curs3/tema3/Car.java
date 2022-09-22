package curs3.tema3;

public class Car {

	
	public static String brand;
	
	public static String type = "Suv";
	
	public static String engine;
	
	public Car(String brand, String engine) {
		this.brand = brand;
		this.engine = engine;
		
	}
	
	public static String carDetials() {
		
		return "All " + brand + " cars are " + engine + " and are of type " + type;
	}
	
}
