package polymorphism;

public class OverLoading {
	//variable called in this class.
	//Compile-Time Polymorphism(Static)-Method Overloading
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		System.out.println(c.add(25.20, 30.10));
		System.out.println(c.add(20, 20));
		System.out.println(c.add(30, 40, 50));
	
}
}
