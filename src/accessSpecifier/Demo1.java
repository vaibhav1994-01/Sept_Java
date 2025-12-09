package accessSpecifier;

public class Demo1 {
	//Types of Method & calling variables accordingly.
	public void publicMethod() {
		System.out.println("Public Method - anywhere");
	}
	
	public void privateMethod() {
		System.out.println("Private Method - same class only");
	}
	
	public void protectedMethod() {
		System.out.println("Protected Method - package + subclass");
	}
	
	void defaultMethod() {
		System.out.println("Default Method - same package only");
	}
	
	public static void main(String[] args) {
		Demo1 D1 = new Demo1();
		D1.publicMethod();
		D1.privateMethod();
		D1.protectedMethod();
		D1.defaultMethod();
		
	}
}
