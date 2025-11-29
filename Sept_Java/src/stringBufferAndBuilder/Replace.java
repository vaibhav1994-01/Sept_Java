package stringBufferAndBuilder;

public class Replace {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("I like Meditation");
		sb.replace(7, 17, "Exercise");
		System.out.println(sb);
	}

}
