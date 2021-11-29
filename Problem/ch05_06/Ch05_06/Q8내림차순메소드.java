package Ch05_06;

import java.util.Scanner;

public class Q8내림차순메소드 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하세요");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
        displaySortedNumbers(num1, num2, num3);
		

	}

	public static void displaySortedNumbers(double num1, double num2, double num3) {

		int [] nums = {(int) num1, (int) num2, (int) num3};
		
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<2; j++) {
				if (nums[j] < nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		
		System.out.println(nums[0] + ", " + nums[1] +", " + nums[2]);
		
	}



}
