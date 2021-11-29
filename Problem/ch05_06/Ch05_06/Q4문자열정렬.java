package Ch05_06;

import java.util.Scanner;

public class Q4문자열정렬 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("나라 이름을 입력하세요");
		String con1 = input.next();
		String con2 = input.next();
		String con3 = input.next();
		
		
		String[] cons = {con1, con2, con3};
		
		for (int i = 0; i<cons.length; i++) {
			for (int j = 0; j<cons.length-1; j++) {
				if (cons[j].compareTo(cons[j+1]) > 0) {
					String temp = cons[j];
					cons[j] = cons[j+1];
					cons[j+1] = temp;
				}
			}
		}
		for (int i = 0; i<cons.length; i++) {
			System.out.print(cons[i]);
		}
		
				
	}

}
