package q06CraeteBMIClass;

import java.util.Scanner;
//(String name, int age, double weight, double height)
//2개의 constructor에 대한 parameter설정하여 BMI 인스턴스 생성하여 getBMI(),
//getStatus()를 호출하여 비만도 결과 출력
public class TestBMIClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		String name = input.next();
		
		System.out.println("나이를 입력하세요");
		int age = input.nextInt();
		
		System.out.println("몸무게를 입력하세요 (단위 : kg)");
		double weight = input.nextDouble();
		
		System.out.println("신장을 입력하세요 (단위: meter)");
		double height = input.nextDouble();
		
		BMIClass user1 = new BMIClass(name, weight, height);
		
		user1.getBMI();
		
		user1.getStatus();
		
		BMIClass user2 = new BMIClass("홍길동", 30, 70, 1.85);
		
		user2.getBMI();
		
		user2.getStatus();
		

	}

}
