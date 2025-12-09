package encapsulation;

public class AccountNo {
    // Private data - cannot be accessed directly from outside the class.
	
	private int accNo; //instance variable
	private String Name;
	private double amount;
	//Access is provided using public getter and setter methods.
	//void setValue(int accNo) { //local variable
	//this.accNo = accNo; //this keyword is used to identify variable.
	//}
	int getAccountNo() {
		return accNo;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
