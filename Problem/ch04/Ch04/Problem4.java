package Ch04;

import java.util.Scanner;

// if 결과물이 같을 때 비교연산자를 통해 집어 넣자 || 활용하기
// input.close() 는 input을 제거하는 것이다
public class Problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int com = (int) (Math.random()*3);
		
		System.out.println("가위(0), 바위(1), 보(2) 중 숫자 0, 1, 2 중 하나의 숫자를 입력하세요.");
		int user = input.nextInt();
		
		if ((user == 0) && (com !=0)) {
			if (com == 1) {
				System.out.println("당신이 졌습니다.");
			} else {
				System.out.println("당신이 이겼습니다.");
			}
		} 
		else if ((user == 1) && (com !=1)) {
			if (com == 2) {
				System.out.println("당신이 졌습니다.");
			} else {
				System.out.println("당신이 이겼습니다.");
			}
		}	
		else if ((user == 2) && (com != 2)) {
				if (com == 0) {
					System.out.println("당신이 졌습니다.");
				} else {
					System.out.println("당신이 이겼습니다.");
				}
			}
		System.out.println("비겼습니다.");
		}
	}


