package Ch05_06;

import java.util.Scanner;

public class Q9숫자의각자리수더하기 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		
		int Number = input.nextInt();
		
		System.out.println("숫자의 각자리수의 합은 " + sumDigits(Number));

	}

	public static int sumDigits(int number) {
		int sum = 0;
		int i = 1;
		while (i<number) {		
			sum += number%(i*10)/i;
			i *= 10;	
		}
		return sum;
	}

}
