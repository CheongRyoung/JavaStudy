package Ch05_06;

import java.util.Scanner;

public class Q5문자개수세기 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("문자를 입력하세요");
		
		String word = input.nextLine();
		
		int num = wordN(word);
		
		System.out.println("전체 문자 개수는 " + num + "입니다.");

	}

	public static int wordN(String word) {
		int sum = 0;
		for (int i=0; i<word.length(); i++) {
			
			if (Character.isLetter(word.charAt(i))) {
				sum += 1;
			}
		}
		return sum;
	}

}
