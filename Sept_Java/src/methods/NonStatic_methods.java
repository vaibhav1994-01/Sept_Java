package methods;

public class NonStatic_methods {

	
	public static void main(String[] args) {
		
		NonStatic_methods a = new NonStatic_methods();
		a.tom();
        a.jerry();
        
    
        
	}
	
	
	private void tom() { //non static type method guest 1
	
	System.out.println("This is non static private method");
}

	
	public void jerry() { //guest 2

		
		System.out.println("This is non static method from another class");	
}

}	
	
