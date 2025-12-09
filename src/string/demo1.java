package string;

public class demo1 {
	
	String A= "abc"; // global, class level, instance

	public static void main(String[] args) {
		
		String A="India"; 
		
		String ab = new String ("Maharashtra");
		System.out.println(A);
		System.out.println(ab);

		//Equals Method
		String S1 = "Cinephile"; //object duplication not allowed
		String S2 = "Drama";
		String S3 = new String ("Cinephile");
		String S4 = new String ("Drama");
		
		System.out.println(S1.equals(S3));//true or false
		System.out.println(S1.equals(S4));
		
		//Concatenates method
		String S5 = "I'm a";
		String S6 = "movie lover";
		
		System.out.println(S5 +" " + S6); //using +
		System.out.println(S6 +" ".concat(S5) +" ".concat(S1)+" ".concat(S2)); // using.concat
	}

}
