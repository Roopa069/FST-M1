package hello;

public class Car {
	// Properties (state)
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	
	// Constructor
	Car() {
		this.tyres = 4;
		this.doors = 4;
		
	}
	
	public void displayCharacteristics() {
		System.out.println("Color of the car is: " + color);
		System.out.println("transmission mode of the car is: " + transmission);
		System.out.println("make of the car is in: " + make);
		System.out.println("no.of types car have: " + tyres);
		System.out.println("no.of doors car have: " + doors);
	}
	
	public void accelarate() {
		System.out.println("Car is moving forward.");
	}
	
	public void brake() {
		System.out.println("Car has stopped.");
	}

}
