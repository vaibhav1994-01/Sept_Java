package abstraction;

public class TestAbstraction {
		public static void main(String[] args){
		Vehicle v1 = new Car();
		v1.start();
		v1.fuel();

		Vehicle v2 = new Bike();
		v2.start();
		}
		
	}

