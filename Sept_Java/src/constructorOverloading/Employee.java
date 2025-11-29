package constructorOverloading;

public class Employee {
	
	String name;
	int id;
	String department;
	
	//multiple parameters.
	//Constructor 1
	Employee() {
		name = "Unknown";
		id = 0;
		department = "None";
	}
	//Constructor 2
		Employee(String n,int i) {
			name = n;
			id = i;
			department = "General";
		}
		//Constructor 3
		Employee(String n, int i, String d) {
			name = n;
			id = i;
			department = d;
		}
		void display() {
			System.out.println(name + " | " + id + " | " + department);
		}

}
