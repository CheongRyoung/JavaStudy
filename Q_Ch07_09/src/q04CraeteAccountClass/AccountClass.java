package q04CraeteAccountClass;

//fields
//• id (private int type, 초기값 0)
//• balance (private double type, 초기값 0)
//• annualInterestRate (private double type, 초기값 0)
// constructor
//• default constructor 생성
//• id와 balance를 초기화하는 constructor
// methods
//• Getter/setter 만들기 : id, balance, annualInterestRate (년이자율은 4.5%로 입력될 경
//우 100으로 나눈 값이 annualInterestRate 변수에 들어감)
//• getMonthlyInterest(), getMonthlyInterestRate()
//• withdraw(double money), deposit(double money)

public class AccountClass {
	int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	
	public AccountClass() {
		this(0, 0);
	}
	public AccountClass(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		if (annualInterestRate >= 1) {
			annualInterestRate = annualInterestRate/100;
		}
		this.annualInterestRate = annualInterestRate;
	}
	public double getMonthlyInterest() {
		return this.balance*getMonthlyInterestRate();
	}
	public double getMonthlyInterestRate() {
		return this.annualInterestRate/12;
	}
	public void withdraw(double money) {
		this.balance = this.balance-money;
	}
	public void deposit(double money) {
		this.balance = this.balance+money;
	}
}
