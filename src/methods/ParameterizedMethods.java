package methods;

public class ParameterizedMethods {

	public static void abc (int a, int b , double d) { // static parameterized method. A parameter is a variable declared inside method's parentheses.
		
	}
	
	
	
	public static void main(String[] args) {
		abc(50, 70, 22.24); //argument(actual value passed while calling the method)
		System.out.println(50);
		
		ParameterizedMethods p= new ParameterizedMethods(); //object creation (class name object name = new class name)
		p.greetCustomer("PVR"); 

	}
	
	public void greetCustomer(String name) { //non static parameterized method.
		System.out.println("Welcome to " + name);
	}
	
	}
