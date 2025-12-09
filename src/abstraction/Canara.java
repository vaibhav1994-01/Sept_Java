package abstraction;

public class Canara extends RBIBANK{
	
	public static void main(String[] args) {
	
	RBIBANK bank = new Canara();
	bank.creditCard();
	bank.debitCard();
}
	

	
	@Override
	public void creditCard() {
		System.out.println("Canara Credit Card");
		
	}

	@Override
	public void debitCard() {
		System.out.println("Canara Dedit Card");
		
	}

}
