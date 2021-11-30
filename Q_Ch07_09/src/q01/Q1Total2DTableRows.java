package q01;

import java.util.Scanner;

//3 X 4 (3행, 4열) 2차원 배열을 만들고 컨솔로 부터 실수
//값을 읽어 온후 각 행의 합계를 구하여 출력하시오
// 컨솔에서 3행 4열의 double type의 실수 값을 읽을 것
// 각 행의 합계를 구하여 결과를 컨솔에 출력
//• “첫번째 행의 합계는 ~ 입니다.”를 출력
//• “두번째 행의 합계는 ~ 입니다.”를 출력
//• “세번째 행의 합계는 ~ 입니다.”를 출력
public class Q1Total2DTableRows {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[][] sums = new double[3][4];
		
		System.out.println("3행 4열 데이터에 대하여 행 단위로 데이터를 space로 구분된 데이터를 enter key를 쳐서 입력하세요");
		for ( int i = 0; i<sums.length; i++) {
			for (int j = 0; j<sums[i].length; j++) {
				sums[i][j] = input.nextDouble();
			}
		}
			
		
		for ( int i = 0; i<sums.length; i++) {
			double sum = 0;
			for (int j = 0; j<sums[i].length; j++) {
				sum += sums[i][j];
			}
			System.out.println((i+1)+"번째 행의 합계는 " + sum + "입니다.");
		}
	
		
	}

}
