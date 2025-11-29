package multiLevel_Inheritance;

public class Cub extends Lion {
	//This class is Child, having properties of Father(Lion) as well as Grandfather(Animal)
	
	public void squeaks() {
		System.out.println("Squeaking...");
	}
	
	public static void main(String[] args) {
		//we have created only one object & called methods from two different class.
		Lion l = new Lion();
		l.eat();
		l.roar();
		l.sleeping();
	}
}
