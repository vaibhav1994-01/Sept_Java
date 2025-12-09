package interfaces;

public class BOI implements BankOfAmerica, HSBCBANK, RBIBANK {

	public static void main(String[] args) {
		BOI b = new BOI();
		b.debitCard();
		b.creditCard();
		b.TransferMoney();
		b.loan();
		b.bikeloan();
		b.carloan();
		b.mutualFund();
		b.homeloan();
	}
	@Override
	public void debitCard() {
		System.out.println("BOI - Debit Card");
		
	}

	@Override
	public void creditCard() {
		System.out.println("BOI - Credit Card");
		
	}

	@Override
	public void TransferMoney() {
		System.out.println("BOI - Transfer Money");
		
	}

	@Override
	public void loan() {
		System.out.println("BOI - Loan");
		
	}

	@Override
	public void bikeloan() {
		System.out.println("BOI - Bike Loan");
		
	}

	@Override
	public void carloan() {
		System.out.println("BOI - Car Loan");
		
	}

	@Override
	public void mutualFund() {
		System.out.println("BOI - Mutual Fund");
		
	}

	@Override
	public void homeloan() {
		System.out.println("BOI - Home Loan");
		
	}

}
