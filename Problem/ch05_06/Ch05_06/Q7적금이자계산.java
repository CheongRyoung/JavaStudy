package Ch05_06;

import java.util.Scanner;

public class Q7적금이자계산 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("매월 적금 금액을 입력하세요 (단위 : 원)");
		int 적금액 = input.nextInt();
		
		System.out.println("년 이자율을 입력하세요 (단위 : %)");
		int 이자율 = input.nextInt();
		
		System.out.println("적금 기간을 입력하세요 (단위 : 월)");
		int 기간 = input.nextInt();
		
		int 원금 = 적금액 * 기간;
		double 이자총액 = interest(적금액, 이자율, 기간)-원금;
		
		System.out.println("총 " + 기간 + "개월이 지난 후의 적금액 (" + 원금 + " + " + 이자총액 + ")");
		
	}

	public static double interest(int 적금액, int 이자율, int 기간) {
		double total = 적금액;
		double sum = 0;
		for (int m=0; m<기간; m++) {
			total = (total)*(1200+이자율)/12/100;
			sum += total;
		}

		return sum;
	
	}
}

