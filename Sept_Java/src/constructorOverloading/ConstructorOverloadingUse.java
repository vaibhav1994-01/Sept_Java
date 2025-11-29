package constructorOverloading;

public class ConstructorOverloadingUse {

	public static void main(String[] args) {
		Employee e = new Employee();
		Employee e1 = new Employee("Vaibhav", 10);
		Employee e2 = new Employee("Vijay", 9, "ITbatch");
		
		e.display();
		e1.display();
		e2.display();
	}

}
