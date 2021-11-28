package Ch04;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		int ran = (int) (Math.random()*101);
		Scanner input = new Scanner(System.in);
		int num;
		boolean resault = true;
		System.out.println("1~100까지 숫자를 추측해 보세요");
		
		while (true) {
			if(resault == false) {
				System.out.println("1~100까지 숫자를 다시 추측해 보세요");
			} resault= false;
			num = input.nextInt();
			
			if (ran > num) {
				System.out.println("당신의 추측한 숫자의 값이 낮습니다.");
			} else if (ran == num){
				break;
			} else {
				System.out.println("당신의 추측한 숫자의 값이 높습니다.");
			}
		
		}System.out.println("숫자 " + num + "정확히 맞추었습니다.");
	}

}
