package Ch04;

import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("전체 학생수를 입력하세요 : ");
		
		int num = input.nextInt();
		int score = 0;
		for (int cnt = 1; cnt<=num; cnt++) {
			System.out.println("점수를 입력하세요 : ");
			int score1 = input.nextInt();
			if (score < score1 ) {
				score = score1;
			}
		} System.out.println("전체 학생 중 최고 성적 : " + score + "점");

	}

}
