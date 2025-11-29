package loop;

public class ReverseString {

	public static void main(String[] args) {
		
		String originalString = "International";
		String ReverseString= ""; //string is kept empty for declaring/printing reverse order of original string.
		
		for(int i=originalString.length()-1; i>=0; i--) {
			ReverseString += originalString.charAt(i);
			
		}
		System.out.println("original String :" +originalString);
		
		System.out.println("reverse string :"+ ReverseString);
	}

}
