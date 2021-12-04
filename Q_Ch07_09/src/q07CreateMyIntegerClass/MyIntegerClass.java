package q07CreateMyIntegerClass;

// fields
//• value (private int type)
// constructor
//• MyInteger(int value)
// methods
//• public int getValue() : value 가져오기
//• public boolean isEven() : value가 짝수인지 체크
//• public boolean isOdd() : value가 홀수인지 체크
//• public boolean equals(int number) : value와 number가 같은지 체크
public class MyIntegerClass {
	private int value;
	
	public MyIntegerClass(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	
	public boolean isEven() {
		if (value%2 ==0) {
			return true;
		} else {
			return false;
		}
	}
	public boolean isOdd() {
		if (value%2 ==1) {
			return true;
		} else {
			return false;
		}
	}
	public boolean equals(int number) {
		if (this.value == number) {
			return true;
		} else {
			return false;
		}
	}
	
	public void printResult(MyIntegerClass value) {
		System.out.println("vlaue = " + value.getValue());
		
		if (value.isEven()) {
			System.out.println("짝수입니다.");
		}
		if (value.isOdd()) {
			System.out.println("홀수입니다.");
		}
		if (value.equals(7)) {
			System.out.println("입력된 숫자와 같습니다.");
		} else {
			System.out.println("입력된 숫자와 다릅니다.");
		}
		
		System.out.println();
	}
}
