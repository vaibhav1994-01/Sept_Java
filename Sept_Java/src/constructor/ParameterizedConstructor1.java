package constructor;

public class ParameterizedConstructor1 {
	
	String name;
	int age;
	
	//Parameterized Constructor
	ParameterizedConstructor1(String n, int a) {
		name = n;
		age = a;
	}
	void display() {
		System.out.println(name + " " + age);
	}
}
