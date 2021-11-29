package Ch05_06;

import java.util.Scanner;

public class Q10숫자역순 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		
		int num = input.nextInt();
		
		reverse(num);
		

	}

	private static void reverse(int num) {
		int i = 1;
		int number = 0;

		while (i<num) {
			number *= 10;
			number += num%(i*10)/i;
			i *= 10;
		}

		System.out.println(number);
	}


}
