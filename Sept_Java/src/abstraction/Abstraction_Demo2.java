package abstraction;

public class Abstraction_Demo2 extends Abstraction_Demo1 {

	public void Method3() {
		System.out.println("This is Method3");
	}
	public void Method4() {
		System.out.println("This is Method4");
	}
	public void Method5() {
		System.out.println("This is Method5");
	}
	public void Method6() {
		System.out.println("This is Method6");
	}
	
	
	public static void main(String[] args) {
		Abstraction_Demo1 ab = new Abstraction_Demo2(); //dynamic binding
		ab.Method1();
		ab.Method2();
		ab.Method3(); //concrete method
		ab.Method4();
		
		Abstraction_Demo1 ab1 = new Abstraction_Demo2();
		ab1.Method1();
		ab1.Method3();
		ab1.Method4();
		
		
		
		
	}
}
