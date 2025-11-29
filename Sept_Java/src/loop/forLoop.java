package loop;

public class forLoop {

	public static void main(String[] args) {
		
		String name ="International";//length is 13
		System.out.println(name.length());
		
		for (int i=0; i<name.length();i++) { //Printing character as per index.
			System.out.println("Character at"+i+": "+name.charAt(i));
			
					
		}
	}

}
