package Ch02_03;

import java.util.Scanner;

/*  4개의 정수값을 키보드로 부터 읽어, 4개의 정수값이 모두
같으면 “4개 정수값이 동일합니다”를 출력하고, 아니면
“4개의 정수값이 동일하지 않습니다.”를 출력하시오
*/
public class Problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("네 개의 정수 값을 입력하시오");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		
		boolean bResult = (num1 == num2 && num1 == num3 && num2 == num3 && num3 == num4);
		
		System.out.println(bResult ? "4개 정수값이 동일합니다" : "4개의 정수값이 동일하지 않습니다.");
		


	}

}
