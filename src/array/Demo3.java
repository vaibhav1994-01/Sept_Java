package array;

public class Demo3 {

	public static void main(String[] args) {
		char ch[]= new char[6];
		
		ch[0]= 'V';
		ch[1]= 'a';
		ch[2]= 'i';
		ch[3]= '@';
		ch[4]= '1';
		System.out.println(ch[0]);
		
		//print all values using forEach loop
		for(char c :ch) {
			System.out.println(c);
	}

}
}