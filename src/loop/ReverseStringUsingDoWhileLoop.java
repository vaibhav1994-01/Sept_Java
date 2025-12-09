package loop;

public class ReverseStringUsingDoWhileLoop {

	public static void main(String[] args) {
		String word = "CREATEYOUROWNSUNSHINE";
		String reverse= "";
		int i = word.length()-1;
		
		do {
			reverse +=word.charAt(i);
			i--;
			
		}while(i>=0);
		System.out.println(reverse);
	}

}
