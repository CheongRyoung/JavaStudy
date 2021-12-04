package q07CreateMyIntegerClass;

//TestMyInteger class
//• value가 7, 26인 MyInteger 인스턴스 생성
//• 2개 인스턴스에 대하여 getValue(), isEven(), isOdd(), equals method 실행
//• equals method 실행할 때 입력되는 number는 7을 입력할 것
public class TestMyIntegerClass {

	public static void main(String[] args) {
		MyIntegerClass value1 = new MyIntegerClass(7);
		MyIntegerClass value2 = new MyIntegerClass(26);
		
		value1.printResult(value1);
		value2.printResult(value2);
	}
}
