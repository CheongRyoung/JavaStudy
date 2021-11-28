package Ch04;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = 1;
		int sum = 0;
		int cntM = 0;
		int cntP = 0;
		int cnt = 0;
		
		
		while (num!=0) {
			System.out.println("연산할 정수들을 입력하세요 :");
			num = input.nextInt();
			
			sum += num;
			cnt += 1;
			
			if (num < 0) {
				cntM += 1;
			} else if (num > 0){
				cntP += 1;
			}
			
			
		}
		System.out.println("양의 정수 : " + cntP + ", " + "음의 정수 : " + cntM + ", " + "전체합 : " + sum + ", " + "전체 평균값 : " + sum/cnt);
		
	}

}
