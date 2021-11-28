package Ch04;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("3개의 정수값을 입력하세요 : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int temp;
		if((num1 > num2) && (num1 > num3)) {
			if (num2 > num3) {
				temp = num1;
				num1 = num3;
				num3 = temp;
			} else {
				temp = num1;
				num1 = num2;
				num2 = num3;
				num3 = temp;
			}
			}else if((num2 > num1) && (num2 > num3)) {
				if (num1 > num3) {
					temp = num1;
					num1 = num3;
					num3 = num2;	
					num2 = temp;
				} else {
					temp = num3;
					num3 = num2;
					num2 = temp;
					
				}
				
				} else if((num3 > num2) && (num3 > num1)) {
					if(num2 < num1) {
						temp = num1;
						num1 = num2;
						num2 = temp;
					}
				
				} System.out.println(num1 + ", " + num2+ ", " + num3);
	}
	
			
} 
			



