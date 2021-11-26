package question;



public class Q6KeypadHands {
	
	public static void main(String[] args) {
		int[] nums = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "left";
//		LRLLRRLLLRR
//		LRLLRRLLLRR
		
		System.out.println(solution1(nums, hand));
		System.out.println(solution2(nums, hand));

		
	}
	private static String solution2(int[] nums, String hand) {
		
		int[][] position = {{3, 1}, {0, 0}, {0, 1}, {0, 2},
				{1, 0}, {1, 1}, {1, 2},
				{2, 0}, {2, 1}, {2, 2},
				};
		
		int[] lefthand = {3,0};
		int[] rightHand = {3,2};
		
		int[] numPosition;
		String answer = "";
		for (int i = 0; i < nums.length; i++) {
			numPosition = position[nums[i]];
			if ( numPosition[1] == 0) {
				answer += "L";
				lefthand = numPosition;
				continue;
			} else if(numPosition[1] == 2) {
				answer += "R";
				rightHand = numPosition;
				continue;
			} 
			
			int leftInterval = Math.abs(lefthand[0] - numPosition[0]) + Math.abs(lefthand[1] - numPosition[1]);
			int rightInterval = Math.abs(rightHand[0] - numPosition[0]) + Math.abs(rightHand[1] - numPosition[1]);

			if ( rightInterval ==  leftInterval && hand.equals("left")) {
				answer += "L";
				lefthand = numPosition;
				continue;
			} else if (rightInterval ==  leftInterval && hand.equals("right")) {
				answer += "R";
				rightHand = numPosition;
				continue;
			}
			if ( rightInterval  > leftInterval) {
				answer += "L";
				lefthand = numPosition;
				continue;
			} else if (rightInterval < leftInterval) {
				answer += "R";
				rightHand = numPosition;
				continue;
			}
		}
		return answer;
	}
	public static String solution1(int[] numbers, String hand) {
   
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
