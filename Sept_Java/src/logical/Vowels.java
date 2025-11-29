package logical;

public class Vowels {

	public static void main(String[] args) {
		
		String word = "MAInTain";// 4 vowels(duplicates are also counted)
		word= word.toLowerCase();
		int count = 0;
		
		for(int i=0; i < word.length(); i++) {
			
			char ch = word.charAt(i);
			
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
				System.out.println(ch);
				count++;
			}
		}
		System.out.println("Total Vowels : "+ count);
	}

}
