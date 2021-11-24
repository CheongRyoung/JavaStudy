package Ch02_03;

import java.util.Scanner;

/* 분단위의 숫자를 키보드에서 읽어, 일의 수와 년의 수를 구
하여 console에 출력하시오
 1 일 : 24 시간 * 60분 => 1440분
 1년 : 365일로 가정 */
public class Problem2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("분단위의 숫자를 임의로 쓰시오 ");
		int Minutes = input.nextInt();
		
		int day = Minutes / 60 / 24;
		int year = day / 365;
		
		System.out.println(Minutes + "분은 " + day + "일 이고 " + year + "년 입니다.");

	}

}
