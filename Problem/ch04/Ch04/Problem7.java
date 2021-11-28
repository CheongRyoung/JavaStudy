package Ch04;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("매월 적금 금액을 입력하세요 :");
		double Money = input.nextInt();
		
		System.out.println("1년 이자율을 입력하세요(단위:%) : ");
		int interest = input.nextInt();
		int Mangi = 0;
		double total = 0;
		
		for (int m=1; m<=6; m++) {
			total = (Money+total)*(1200+interest)/12/100;

			
			System.out.println(m +"개월 후 :" + total);
			
		} System.out.println(" 총급액 : " + total);
	}

}
