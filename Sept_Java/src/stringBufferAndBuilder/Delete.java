package stringBufferAndBuilder;

public class Delete {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("engineer");
		sb.delete(6, 8);
		System.out.println(sb);

	}

}
