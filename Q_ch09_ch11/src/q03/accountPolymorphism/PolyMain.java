package q03.accountPolymorphism;

public class PolyMain {

	public static void main(String[] args) {
		Account obj1 = new Account("111-22-3333", "임꺽정", 10000);
		CheckingAccount obj2 = new CheckingAccount("444-55-666", "홍길동", 20000,	"5555-666-777-888");
		CreditLineAccount obj3 = new CreditLineAccount("777-22-3333", "김선달", 3000, 2000000);
		BonusPointAccount obj4 = new BonusPointAccount("000-00-00000", "김미영",0, 0);
		
		printAccountInfo(obj1);
		System.out.println();
		
		printAccountInfo(obj2);
		System.out.println();
		
		printAccountInfo(obj3);
		System.out.println();


		
	}

	private static void printAccountInfo(Account object) {
		System.out.println("계좌 번호: " + object.accountNo);
		System.out.println("예금주 이름: " + object.ownerName);
		System.out.println("잔액: " + object.balance);
		
	}

	}


