package programers;

import java.util.Arrays;

public class 완주하지못한선수 {

	public static void main(String[] args) {
		String[] participant = {"1","1","3","4","5"};
		String[] completion = {"1","1","3","4"};
		
		System.out.println(solution(participant, completion));
	
	}
		
		
	public static String solution(String[] participant, String[] completion) {
	        Arrays.sort(participant);
			Arrays.sort(completion);
	        
	        for (int i = 0; i<completion.length; i++) {
				if (!participant[i].equals(completion[i])) {
					return participant[i];
				}	
			}
	        return participant[participant.length-1];
	    }
		
		
		
	}

