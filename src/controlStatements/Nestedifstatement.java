package controlStatements;

public class Nestedifstatement {

	public static void main(String[] args) {
		
		int a = 250;
		int b = 500;
		int c = 750;
		
		if (a > b) {
			if (a > c) {
				System.out.println("a is greater");
			}
		}
		else if (b > c && b > a) {
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
		}
	}

}
