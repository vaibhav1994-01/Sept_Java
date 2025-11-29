package exceptionHandling;

public class Demo3 {

	public static void main(String[] args) {
		// example string type array
		String name = "Bangalore"; //0,1,2,3,4,5,6,7,8
		System.out.println(name.charAt(0));
		try {
			System.out.println(name.charAt(9));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Invalid String Index");
		}
		
		System.out.println(name.charAt(2));
		System.out.println(name.charAt(7));
	}

}
