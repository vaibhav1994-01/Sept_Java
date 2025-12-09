package abstraction;

abstract class Vehicle {

	abstract void start(); 

	public void fuel(){
	System.out.println("All vehicles need fuel");
	}
	}

	//Subclass
	class Car extends Vehicle{
	void start(){
	System.out.println("Car starts with key");
	}
	}

	class Bike extends Vehicle {
	void start(){
	System.out.println("Bike starts with kick");
	}
	}

	
