package exceptionHandling;

public class Demo6 {

	public static void main(String[] args) {
		
		try {
			int a = 10/0;
			System.out.println("Code Started");
		}
		catch(ArithmeticException e) {
			System.out.println("Invalid Operation");
		}
		finally {
			System.out.println("Code Ended");
		}
	}

}
			//final - keyword is modifier -used to restrict variable,method,class
			//finally - keyword is block - used in exception handling, always execute in any conditions
