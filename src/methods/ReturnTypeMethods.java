package methods;

public class ReturnTypeMethods {
	
	//method without void return type
	public double calculateDiscountamount(double price, double percent) { //example 1
		return price * percent/100;
	}
	public int abc(int a,int b) { //example 2
		return a/b;
}

	public static void main(String[] args) {
		ReturnTypeMethods obj = new ReturnTypeMethods();
		double discountAmount = obj.calculateDiscountamount(5000, 15);
		System.out.println("Discount amount is: " + discountAmount);
		
		ReturnTypeMethods obj1 = new ReturnTypeMethods();
		obj1.paymentIssue(35);
		
		ReturnTypeMethods obj2 = new ReturnTypeMethods();
		int div = obj2.abc(50, 5);
		System.out.println(div);
	}
	
	//method with void return type
	public void paymentIssue(int Mobile) {
		System.out.println("Order No. " + Mobile + " is cancelled due to payment issue. ");
		
	}
	
}
