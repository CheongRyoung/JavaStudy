package ch01_codingTest;

// ���� �迭 �񱳽� �ݺ����� ����� ��, �񱳰� �����ų� ���Ǹ� �ȵǴ� �迭�� �迭���� ������ �����ϴ� ��
// ���ܸ� ���ϱ� ���ؼ��� �ǵ��� ���İ� �����Ÿ� ����.
import java.util.Arrays;

public class ü���� {
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
