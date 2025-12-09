package singleInheritance;

public class Shelter extends Animal {

	public static void main(String[] args) {
		//calling method from another class
		// one child has one parent is single inheritance
		Animal a = new Animal();
		a.tiger();
		a.horse();
	}
}
