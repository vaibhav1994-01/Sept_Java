package constructor;

public class ParameterizedConstructor2 {

	public static void main(String[] args) {
		ParameterizedConstructor1 c1 = new ParameterizedConstructor1("Rohit Sharma", 45);
		ParameterizedConstructor1 c2 = new ParameterizedConstructor1("Removed as Captain on October", 4);
		
		c1.display();
		c2.display();
	}

}
