package exceptionHandling;

public class Demo {

	public static void main(String[] args) {
		String [] cart = {"Shoes", "Bags","TV"};
		try {
			System.out.println(cart[4]);
		}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid Index");
			}
			System.out.println(cart[1]);
		}

	}


