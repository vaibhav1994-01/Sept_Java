package polymorphism;

public class OverRiding extends Animal {
	
	//Run-Time Polymorphism(Dynamic)-Method OverRiding
	
	@Override
	void Animal() {
		System.out.println("Animal is Hunting");
	}

	public static void main(String[] args) {
		OverRiding a = new OverRiding();
				a.Animal();

	}

}
