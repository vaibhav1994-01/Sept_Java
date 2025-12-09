package exceptionHandling;

public class Demo2 {

	public static void main(String[] args) {
		//example - integer type array
		int [] number = {5,10,15,20}; //length of array is 4 & index is 3(0,1,2,3)
		System.out.println("Code Started");

		try {
		
		System.out.println(number[4]); //Index 4 out of bounds for length 4 
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index");
		}
		System.out.println("Code Ended");
		}
	}


