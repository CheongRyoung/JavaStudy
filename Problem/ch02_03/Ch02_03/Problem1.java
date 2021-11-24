package Ch02_03;

import java.util.Scanner;

/* 0과 1000사이의 3자리 정수를 키보드에서 읽어, 정수의 각
자리의 수를 모두 더한 값을 출력하시오
 예 : 932를 읽은 경우, 모두 더한 값 : 9 + 3 + 2 = 14
 Hint : %, / 연산자(operator) 사용
• 932%10 == 2  932의 마지막 자리의 수인 2를 가져옴
• 932/10 == 93  2를 제외한 93 두자리의 수를 가져옴 */
public class Problem1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("0~1000 사이의 숫자를 입력하시오 ");
		int num = input.nextInt();
		// 세자리수 정수를 입력 안하면 어떻게 해야 하지?
		// 1. 정수를 입력하는데, 1자리 이하이거나, 세자리 이상인 경우 => 3자리 정수를 다시 입력해 주세요
		// 2. 정수를 입력하는 것이 실수, 문자열, 문자코드 등 체크
		// 
		int num1 = num % 10;
		int num2 = num /10 %10;
		int num3 = num /100 %10;
		
		System.out.println("세 자리의 숫자를 각각 더한 값은 " + (num1 + num2 + num3) + "입니다.");

	}

}
