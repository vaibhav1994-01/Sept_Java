package abstraction;

public abstract class RBIBANK {
	
	int number = 15;
	
	public void loan() {
		System.out.println("RBI LOAN");
	}

	public abstract void creditCard();
	public abstract void debitCard();
	
}
