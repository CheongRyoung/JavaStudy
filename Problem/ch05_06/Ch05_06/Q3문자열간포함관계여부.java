package Ch05_06;

import java.util.Scanner;

public class Q3문자열간포함관계여부 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("첫번째 문자열을 입력하시오");
		String str1 = input.next();
		
		System.out.println("두번째 문자열을 입력하시오");
		String str2 = input.next();
		
		boolean result = true;
		
		while (true) {
			if (result == false) {
				System.out.println(str2 + "는 " + str1 + "의 substring이 아닙니다. \n 다시입력해주세요");
				System.out.println("첫번째 문자열을 입력하시오");
				str1 = input.next();
				System.out.println("두번째 문자열을 입력하시오");
				str2 = input.next();
			}
			if (str1.contains(str2)) {
				break;
			}
			result = false;
		
		}
		System.out.println(str2 + "는 " + str1 + "의 substring 입니다.");
	}
}


