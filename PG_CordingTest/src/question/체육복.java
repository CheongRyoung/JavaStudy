package ch01_codingTest;

// 정수 배열 비교시 반복문을 사용할 때, 비교가 끝났거나 사용되면 안되는 배열은 배열값을 음수로 수정하는 팁
// 예외를 피하기 위해서는 되도록 정렬과 선제거를 하자.
import java.util.Arrays;

public class 체육복 {
	    public int solution(int n, int[] lost, int[] reserve) {
			Arrays.sort(lost);
	        Arrays.sort(reserve);
	        int answer = n-lost.length;       

	        for(int i=0; i<lost.length; i++) {
				for(int j=0; j<reserve.length; j++) {
					if ((lost[i]==reserve[j])) {
	                    answer++;
	                    lost[i] = -2;
	                    reserve[j] = -2;
	                    break;
	                }}}
	        for(int i=0; i<lost.length; i++) {
				for(int j=0; j<reserve.length; j++) {   
	                if ((lost[i]-1==reserve[j]) || (lost[i]+1==reserve[j])) {
	                    answer++;
	                    reserve[j] = -2;
						break;
					}
				}
			}        
			return answer;        
	    }
}
