package exceptionHandling;

public class Demo5 {
	
	public static void main(String[] args) {
		int age = 17;
		
		if(age<18) {
			
			throw new ArithmeticException("Not Eligible for Vote");	
		}
		else {
			System.out.println("Eligible for Vote");
		}

	}

}
