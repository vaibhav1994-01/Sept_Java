package exceptionHandling;

public class Demo1 {

	public static void main(String[] args) {
		
		
		//unchecked exception - These are occured during run time
		System.out.println("Execution Started"); 
		
		try { //try block (try is keyword)
		int a =20;
		int b = 0;
		int c =a/b; 
		}
		
		catch(ArithmeticException e) { //catch block(catch is keyword)
			System.out.println("Error : Division by zero is not allowed");
		}
		System.out.println("Execution Ended");
	}
	
}
