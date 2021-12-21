package a.a.a;
// 클래스 관련 설명
import java.util.Locale;

// 클래스 설계 원칙
// 1. 캡슐화(정보의 은닉) - 외부 수정방지
// 2. 응집도는 높이고 결합도는 낮춰야 된다.

// 클래스는 왜하지?
// 설계를 하게 되면 생산성(개발시간이 얼마나 걸리나)은 낮아진다. 
// 유지보수 효율은 높아진다.

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student();   // new 키워드를 통해서 인스턴스를 힙메모리에 등록
		st1.age = 10; // 서로다른 저장공간에서 각각 값 생성
		st1.name = "한조";
		st1.score = 77;
		
		Student st2 = new Student(1, 3, "트레이서");
		st1.printData();
		int result1 = st1.plus(13, 6);
		int result2 =st2.plus(13, 6);
		
		double x = Math.cos(12321413);
		
		
	}

}

// 클래스는 문법적으로가 아니고, 개념적으로 2개의 형태가 있다.
// 1. VO(Value Object) - 데이터를 묶는다. 값들을 담을 Object(setter, getter), field가 중요
// 2. Component(혹은 Module) - 기능이 주가 되는 클래스

class Student{
	// 클래스설계 1. 필드 정의
	int age;
	int score;
	String name;
	
	// 2. 생성자(메소드...는 아닌데... 대략 실행되는 녀석, 인스턴스가 생성될 때 한번 실행, 리턴타입이 없다)
	// 생성자는 왜 쓰지? - 값 초기화 목적(외부에서...)
	// 일반적으로 두개를 생성(항상)
	Student() {
		// 실행되는 코드...
		System.out.println("야호");
	}
	// 오버로딩 개념
	Student(int age, int score, String name) {
		this.age = age;  // 똑같은 명으로 필드와 파라미터가 존재가능, 개념적으로 같기 때문에 
		this.score = score;  // => 논리적 문제 발생 누구를 가르켜야하는가 => this.age(이코드가 실행되는 그 시점의 메모리에 접근)를 사용
		this.name =name;
		System.out.println("야호2");
	}
	
	// 3. 메소드 (생성자와 달리 실행하고 싶을 때 언제든지 사용가능)
	// 리턴 타입(void 포함) 메소드명(매개변수 1, ...) {....}
	void printData() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(score);
	}
	// 응집도 파괴수준, 논리적문제가 아닌 설계적 문제
	// 네임의 역할까지만 수행하도록 만들자, method는 객체의 행위(this가 빠지면 잘못된 설계)하고 연관있게 만들어야한다.
	// 멤버 변수와 상관이 없다면, static을 붙여야한다. => 함수로 보고 메소드로 볼 수는 없고, 따로 나만의 유틸 클래스를 만들어 사용해보자
	int plus(int a, int b) {  
		int result = a+b;
//		int result = a+b + this.score; => 메소드의 설계로서 의미가 있다.
		
		return result;
		// System.out.println("두개의 합은 " + result + "입니다.");   포함시 void plusAndPrint() 가 적합
	}
	// 오버라이딩 => 똑같은 메소드명으로 다른 메소드가 선언, parameter의 형태는 다름, 서로 다른 독립된 메소드, 컴파일시 자바 머신이 이름을 바꿈
	int plus(double a, double b) {
		return 111;
		
	}
	
}

class Car{
	// 이렇게 해도 프로그램은 완성되지만 응집도는 낮아짐, 각자 해야할 역할이 다른 곳에 들어가게 되면, 유지보수가 힘들어짐
	int age;
	
	int currentSpeed;
	String color;
	int fuel;
}
