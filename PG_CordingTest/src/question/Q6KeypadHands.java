package question;



public class Q6KeypadHands {
	
	public static void main(String[] args) {
		int[] nums = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "left";
		
		System.out.println(solution(nums, hand));

		
	}
	public static String solution(int[] numbers, String hand) {
   
        int leftHand = 10;
        int rightHand = 12;
        
        String answer = "";
        for (int i : numbers) {
        	if ( i == 0 ) {
        		i = 11;
        	}
        	if ( i == 1 || i == 4 || i == 7 ) {
        		leftHand = i;
        		answer += "L";
        		continue;
        	} else if( i == 3 || i == 6 || i == 9 ) {
        		rightHand = i;
        		answer += "R";
        		continue;
        	}
        	if(Math.abs(leftHand - i)/3 + Math.abs(leftHand - i)%3 == Math.abs(rightHand - i)/3 + Math.abs(rightHand - i)%3
        			&& hand == "left") {
        		leftHand = i;
        		answer += "L";
        		continue;
        	}
        	if(Math.abs(leftHand - i)/3 + Math.abs(leftHand - i)%3 == Math.abs(rightHand - i)/3 + Math.abs(rightHand - i)%3
        			&& hand == "right") {
        		rightHand = i;
        		answer += "R";
        		continue;
        	}
        	if(Math.abs(leftHand - i)/3 + Math.abs(leftHand - i)%3 < Math.abs(rightHand - i)/3 + Math.abs(rightHand - i)%3) {
        		leftHand = i;
        		answer += "L";
        		continue;
        	}
        	if(Math.abs(leftHand - i)/3 + Math.abs(leftHand - i)%3 > Math.abs(rightHand - i)/3 + Math.abs(rightHand - i)%3) {
        		rightHand = i;
        		answer += "R";
        		continue;
        	}
        }
        

	return answer;
	}
}
