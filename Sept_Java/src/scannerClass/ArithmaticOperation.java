package scannerClass;

import java.util.Scanner;

public class ArithmaticOperation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer Number");
		int i = sc.nextInt();
		
		System.out.println("Enter Float Number");
		float j = sc.nextFloat();
		
		float substraction = i - j;
		System.out.println("Substraction of two numbers = "+ substraction);

	}

}
