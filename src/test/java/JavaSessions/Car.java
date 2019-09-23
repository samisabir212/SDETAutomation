package JavaSessions;

public class Car {
	
	String name;
	String color;
	double price;
	String modelNumber;
	String fuelType;
	String ignitionType;
	

	public Car(String name) {
		this.name = name;
	}

	public Car(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public Car(String name, String color, double price, String modelNumber, String fuelType, String ignitionType) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.modelNumber = modelNumber;
		this.fuelType = fuelType;
		this.ignitionType = ignitionType;
	}
	
	@Override
	public String toString(){
		return "";
	}

	public static void main(String[] args) {

		Car c1 = new Car("Audi");
		System.out.println(c1.name);
		System.out.println(c1.price);
		System.out.println(c1.modelNumber);
		
		Car c2 = new Car("BMW", "Blue", 50.5, "525d", "Diesel", "Automatic");
		System.out.println(c2.color);
		System.out.println(c2.price);
		System.out.println(c2);
	}

}
