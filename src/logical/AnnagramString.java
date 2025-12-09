package logical;

import java.util.Arrays;

public class AnnagramString {
	
	public static void main(String[] args) {
		
		String S1= "heart";
		String S2 = "EARTH";
		String S3 = "ACT";
		String S4 = "SAT";
		S2 = S2.toLowerCase();
		
		if(S3.length() != S4.length()) {
			
			System.out.println(S3 +" Is not Annagram of "+S4);
			return;
		}
		char[] arr1 = S1.toCharArray();
		char[] arr2 = S2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if (Arrays.equals(arr1, arr2)) {
			
			System.out.println(S1 + " Is Annagram of " + S2);
		}
		else {
			System.out.println(S1 + " Is not Annagram of " + S2);
		}
}
}
