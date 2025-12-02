package accessModifiers;

public class Private1 { // private method is used only in same class.
	private int No = 45;
	
	public static void main(String[] args) {
		Private1 P1 = new Private1();
		P1.D1();
		System.out.println(P1.No);

	}
	private void D1() {
		System.out.println("Private method");
	}
}
