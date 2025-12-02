package hierarchical_Inheritance;

public class Foal extends Horse {
	//this class have properties of animal & horse. but dont have properties of Lion & Cub & vice versa.
	public void whinny() {
		System.out.println("Whinnying");
	}
	public static void main(String[] args) {
		Horse h = new Horse();
		h.eat();
		h.neigh();
		Foal f = new Foal();
		f.whinny();
	}

}
