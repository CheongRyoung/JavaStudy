package Ch05_06;

import java.util.Scanner;

public class Q1학생정보출력 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] codes = {"I", "A", "C"};
		String[] subjects = {"정보학과", "회계학과", "컴퓨터학과"};
		
		System.out.println("학생코드를 입력하세요");
		
		String codeN = input.next();
		
		//입력된 값 검토
		boolean result = true;
		boolean ac = true;
		
		while (result) {
			if (ac == false) {
				System.out.println("다시 입력해주세요");
				codeN = input.next();
				
			}
			for (int i = 0; i<codes.length; i++) {
				if(codeN.substring(0, 1).equals(codes[i]) && Integer.parseInt(codeN.substring(1)) < 5) {
					result = false;
				}
				ac = false;
			} 
		}
		
		// 전환문
		
		String code = codeN.substring(0, 1);
		String num = codeN.substring(1);
		

		
		String subject = "";
		
		int i = 0;
				
			while (i <codes.length) {
				if (code.equals(codes[i])) {
					subject = subjects[i];  
				} 
				i++;
			
		}
			 System.out.println(subject+ " " + num + "학년" + "입니다.");
		}
	}

		
		
		
	

