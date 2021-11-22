package q03.accountPolymorphism;

public class Account {
	String accountNo;
	String ownerName;
	public int balance;
	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	public void deposit(int amount) {
		this.balance = balance + amount;
	}
	
	public int withdraw(int amount) throws Exception {
		if(balance < amount)
			throw new Exception("잔액이 부족합니다.");
		
		this.balance = balance - amount;
		return balance;
	}
	

	
}
