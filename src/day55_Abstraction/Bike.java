package day55_Abstraction;

public class Bike extends Vehicle{

	public Bike(int wheels, double price) {
		super(wheels, price, "bike", "a person");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
System.out.println("Cycling..");		
	}

	
	
	
	
}
