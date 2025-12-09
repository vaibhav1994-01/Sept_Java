package accessModifiers;


public class Protected1 {
	protected String name = "Automation";

	public static void main(String[] args) {
		Protected1 P4 = new Protected1();
		P4.P1();
		System.out.println(P4.name);
		
		//Protected method can be used in different class of same package.
		//This variable is declared in public class & accessed here.
		Public1 P1 = new Public1(); 
		System.out.println(P1.number);

	}
	protected void P1() {
		System.out.println("protected method");
	}

}
