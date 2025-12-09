package interfaces;

public interface RBIBANK {
	
	int mainbalance=25000;
	static int reducebalance= 500;
	final int addFund= 2500;
	
	void debitCard();
	void creditCard();
	void TransferMoney();
	void loan();
}
