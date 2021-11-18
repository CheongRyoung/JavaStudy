package question;

import java.util.HashMap;

public class Q5StringNumberChange {

	public static void main(String[] args) {
		String A = "23four5six7";

		String[] Num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		String[] NumS = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};


			for(int i =0; i<Num.length; i++) {
				A = A.replace(NumS[i], Num[i]);
				
			}
			int answer = 0;
			answer = Integer.parseInt(A);
			
		
	}

}
