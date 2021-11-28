package Ch04;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("체중을 입력하세요(단위 : kg) : ");
		double weight = input.nextDouble();
		
		System.out.println("키를 입력하세요(단위 : meter) : ");
		double tall = input.nextDouble();

		double bmi = (weight*10) / ((tall*100) * (tall*100));
		bmi = bmi*10000/10;
		if(bmi >= 30) {
			System.out.println("비만입니다.");
		} else if ((bmi <30) && (bmi >= 25)) {
			System.out.println("과체중입니다.");
		} else if ((bmi <25) && (bmi >= 18.5)) {
			System.out.println("정상체중입니다.");
		} else {
			System.out.println("저체중입니다.");
		}
	}

}
