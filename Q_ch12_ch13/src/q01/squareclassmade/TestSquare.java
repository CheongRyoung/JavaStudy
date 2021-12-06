package q01.squareclassmade;

import java.util.Scanner;

public class TestSquare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("정사각형 한 변의 길이를 입력하세요.");
		double side = input.nextDouble();
		
		System.out.println("정사각형의 색깔을 입력하세요.");
		String color = input.next();
		
		System.out.println("색깔이 채워져 있나요? (네, 아니요 로 대답하세요)");
		String answer = input.next();
		
		Square sq1 = new Square();
		Square sq2 = new Square(side);
		Square sq3 = new Square(side, color, answer(answer));
		System.out.println(sq1);
		System.out.println(sq2);
		System.out.println(sq3);
		

	}
	
	public static boolean answer(String answer) {
		if (answer.equals("네")) {
			return true;
		}
		return false;
	}

}
