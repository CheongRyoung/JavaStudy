package Ch02_03;

import java.util.Scanner;

/* 매월 적금 금액과 1년 이자율를 키보드에서 읽어, 6개월후
의 이자와 원금을 합한 총금액을 출력하시오
 예 : 매월 적금 금액 : 100원, 연이자율 : 12%이면
• 월 이자율 : 12%/12 => 1% => 0.01
• 1개월 후 총 금액 => 100*(1 + 0.01) => 101
• 2개월 후 총 금액 => (100+101)*(1 + 0.01) => 203.01 */
public class Problem3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		
		System.out.println("매월 적금 금액(원)과 이자율(%)과 개월수를 쓰시오");
		int pay = input.nextInt();
		double interest = input.nextInt();
		int mo	= input.nextInt();
		
		double rate = (pay * ((mo * (mo+1))/2) *(interest/12)/100);

        
		double deposit = ((pay * mo) + rate);
		System.out.println("6개월 후 원금은 " + deposit + "원 입니다.");
		
	}

}
