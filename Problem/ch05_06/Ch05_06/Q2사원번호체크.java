package Ch05_06;

import java.util.Scanner;

public class Q2사원번호체크 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("사원번호를 입력해주세요");
		
		String num = input.next();
		

		
		boolean ac = true;
		String intNum = num.replaceAll("[^0-9]", "");
		
		
		while (true) {
			if (ac == false ) {
				System.out.println(num + "는 사원번호 형식이 틀립니다. \n 다시 입력해주세요");
				num = input.next();
			}
			if (num.substring(3, 4).equals("-") && 
				num.substring(6, 7).equals("-") &&
				intNum.length() == 9 ) {
				break;
			}
			
			ac = false;
			
		}
		System.out.println(num + "는 사원번호 형식이 맞습니다.");

	}


}
