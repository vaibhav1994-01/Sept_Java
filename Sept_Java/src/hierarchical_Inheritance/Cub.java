package hierarchical_Inheritance;

public class Cub extends Lion {
	// This class have properties of Animal & Lion.
	public void squeaks() {
		System.out.println("Squeaking...");
	}
	
	public static void main(String[] args) {
		//calling methods from two different class.
		Lion l = new Lion();
		l.eat();
		l.roar();
		//calling method from this class.
		Cub c = new Cub();
		c.squeaks();
	}
}
