package q02;

import java.util.Scanner;

public class Q2Total2DTableColumns {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[][] sums = new double[3][4];
		
		System.out.println("3행 4열 데이터에 대하여 행 단위로 데이터를 space로 구분된 데이터를 enter key를 쳐서 입력하세요");
		for ( int i = 0; i<sums.length; i++) {
			for (int j = 0; j<sums[i].length; j++) {
				sums[i][j] = input.nextDouble();
			}
		}
		
		// 행 중에서 가장 긴 열 구하기
		int maxColumnCount = 0;
		
		for(int i =0; i<sums.length; i++) {
			if (maxColumnCount < sums[i].length) {
				maxColumnCount = sums[i].length;
			}
		}
		
		// 실행
		for ( int i = 0; i<maxColumnCount; i++) {
			double sum = 0;
			for (int j = 0; j<sums.length; j++) {
				sum += sums[j][i];
			}
			System.out.println((i+1)+"번째 행의 합계는 " + sum + "입니다.");
		}
	
		
	}

}