package Ch05_06;

import java.util.Scanner;

public class Q6패스워드체크 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("패스워드를 입력하세요");
		
		String password = input.nextLine();
		
		if (check(password)) {
			System.out.println(password + "은 유효합니다.");
		} else {
			System.out.println(password + "은 유효하지 않습니다.");
		}
	}

	public static boolean check(String password) {
		int countNum = 0;
		
		for (int i = 0; i<password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) {
				countNum++;
			}
			if (Character.isLetterOrDigit(password.charAt(i))) {
				
			} else {
				return false;
			}
		if (password.length() >= 10 && countNum >= 3) {
			return true;
		}
			
		}
		return false;
	}

}
