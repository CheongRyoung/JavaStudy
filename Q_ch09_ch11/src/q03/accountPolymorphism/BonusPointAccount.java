package q03.accountPolymorphism;

public class BonusPointAccount extends Account {

	int bonusPoint;

	public BonusPointAccount(String accountNo, String ownerName, int balance, int bonusPoint) {
		super(accountNo, ownerName, balance);
	}



	  public void deposit(int amount){//예금한다 기능을 다시 구현하는 메소드
		balance += amount;
		super.deposit(amount);//SuperClass의 deposit( )호출하여 계산
		bonusPoint += (int)(amount*0.001);
	}

}
