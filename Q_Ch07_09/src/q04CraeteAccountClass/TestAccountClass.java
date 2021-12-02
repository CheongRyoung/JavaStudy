package q04CraeteAccountClass;

//TestAccount class
//• id 1122, balance 20,000원 account 인스턴스 생성하고, 연이자율 4.5%으로 설정
//• 2,500원 withdraw, deposit 3,000원 실행
//• 출력내용 : balance, monthly interest rate
public class TestAccountClass {

	public static void main(String[] args) {
		AccountClass user = new AccountClass(1122, 20000);
		
		user.setAnnualInterestRate(4.5);
		
		user.withdraw(2500);
		user.deposit(3000);
		
		System.out.println("balance = " + user.getBalance() + ", monthly interest rate = " + user.getMonthlyInterestRate());

	}

}
