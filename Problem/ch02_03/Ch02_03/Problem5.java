package Ch02_03;

import java.util.Scanner;

/* 2개의 정수를 키보드로 부터 읽어, 덧셈, 빼기, 곱하기, 평
균, 최대값, 최소값을 구해 출력하시오
 예 : 키보드 읽은 값 a, b
• 덧셈 : a + b
• 뺄셈 : a - b
• 곱하기 : a*b
• 평균 : a + b / 2
• 최대값 : a, b중 큰 값
• 최소값 : a, b중 작은 값*/
public class Problem5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		System.out.println("2개의 정수를 기입하세요");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
				
		int plus = num1 + num2;
		int minus = num1 - num2;
		int multiplication = num1 * num2;
		int average = (num1 + num2) /2;
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2) ;
		
		System.out.println("두 숫자의 연산 값은 다음과 같다.\n 덧셈 " + plus +"\n 뺄셈 " + minus +"\n 곱하기 " + multiplication +"\n 평균 " + average
				+"\n 최대값 " + max +"\n 최소값 " + min);
		

	}

}
