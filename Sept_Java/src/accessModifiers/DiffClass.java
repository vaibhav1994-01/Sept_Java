package accessModifiers;

public class DiffClass {

	public static void main(String[] args) {
		
		Public1 P2 = new Public1();
		P2.M1();
		System.out.println(P2.number);
		
//		Private1 P3 = new Private1(); private method is used only in same class. 
//		P3.D1();
//		System.out.println(P3.No);
		
		Default1 D1 = new Default1();
		D1.show();
		
		Protected1 P4 = new Protected1();
		P4.P1();
		System.out.println(P4.name);		
		
		

	}

}
