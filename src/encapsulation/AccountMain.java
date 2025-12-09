package encapsulation;

public class AccountMain {

	public static void main(String[] args) {
		
		AccountNo acc = new AccountNo();
		
		acc.setAccNo(1585);
		acc.setName("Vaibhav");
		acc.setAmount(3500.25);
		
		
		System.out.println(acc.getAccNo());
		System.out.println(acc.getName());
		System.out.println(acc.getAmount());
		
	}

}
