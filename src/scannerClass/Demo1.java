package scannerClass;

import java.util.Scanner; //scanner is predefined class in java

public class Demo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// in scanner class we can give input in console & can print accordingly.
		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Enter Age");
		int age = sc.nextInt();
		System.out.println("Enter Salary");
		double salary = sc.nextDouble();
		
		System.out.println("Age : "+ age);
		System.out.println("Name : "+ name);
		System.out.println("Salary : "+ salary);
	}

}
