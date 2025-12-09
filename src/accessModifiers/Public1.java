package accessModifiers;

import accessSpecifier.CallingVariables;

public class Public1 extends CallingVariables { //public method can be used in all packages of project.
	public int number =1500;
	public Public1() {
		
	}
	
	public static void main(String[] args) {
		Public1 P1 = new Public1();
		P1.M1();
		System.out.println(P1.number);
		
		CallingVariables d= new CallingVariables();
		System.out.println(d.publicVar); //calling variable from different package
			
	}
	public void M1() {
		System.out.println("Public m1 method");
	}
}
