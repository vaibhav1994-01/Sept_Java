package string;

public class Demo2 {

	public static void main(String[] args) {
		String A = "I Usually Go For a Walk Every Morning.";
		String B = "I Go For a Walk Every Morning.";
		String C = "I Go For a Walk Every Morning.";
		String D = "I go for a walk every morning.";
		String E = "";
		
		System.out.println("====================To Upper Case====================");
		String S1 = A.toUpperCase();
		System.out.println(S1);
		
		System.out.println("====================To Lower Case====================");
		String S2 = A.toLowerCase();
		System.out.println(S2);
		
		
		System.out.println("======================Length=========================");
		int S3 = A.length();
		System.out.println(S3);//space or . is also included while counting length 
		
		
		System.out.println("======================Equals========================");
		System.out.println(A.equals(B));
		System.out.println(B.equals(C));
		
		System.out.println("=====================EqualsIgnore===================");
		System.out.println(C.equalsIgnoreCase(D)); //same sentence from both string is true
		                                           //(even if changes in lower/uppercase)
		
		System.out.println("====================Contains========================");
		System.out.println(A.contains("Us"));
		
		System.out.println("====================isEmpty=========================");
		System.out.println(A.isEmpty());
		System.out.println(C.isEmpty());
		System.out.println(E.isEmpty());
		
		System.out.println("====================CharAt==========================");
		System.out.println("Character at 11th index is = "+ B.charAt(11));
		
		System.out.println("====================EndsWith==========================");
		System.out.println(C.endsWith("ng.")); //true if it is at ending of sentence.
		
		System.out.println("====================StartsWith==========================");
		System.out.println(C.startsWith("G")); //true if it is at starting of sentence
		System.out.println(C.startsWith("I Go"));
		
		System.out.println("====================Substring==========================");
		System.out.println(D.substring(4,8)); //characters/words/space included at index 5 to 7
		
		System.out.println("====================LastIndexOf==========================");
		System.out.println(A.lastIndexOf("l")); //consider's last l of a sentence
												//(if there are duplicate alphabets)
		
		
	}

}
