package controlStatements;

public class SwitchStatement1 {

	public static void main(String[] args) {
		
	int field = 3;
	
	switch (field) {
	case 1:
		System.out.println("Mechanical");
		break;
		
	case 2:
		System.out.println("Civil");
		break;
		
	case 3:
		System.out.println("IT");
		break;
		
	case 4:
		System.out.println("Electronics");
		break;
		
		default:
			System.out.println("Invalid Field");
		
	}

	}

}
