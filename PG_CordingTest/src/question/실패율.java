package ch01_codingTest;


import java.util.*;
import java.util.Map.Entry;


public class 실패율 {
    public int[] solution(int N, int[] stages) {
    	Map<Integer, Double> map = new HashMap<Integer, Double>();
    	for(int i=1; i<=N; i++) {
    		int clears = 0;
    		int noClears =0;
    		for (int j=0; j<stages.length; j++) {
    			if (i < stages[j]) {
    				clears++;
    			} else if( i==stages[j]) {
    				noClears++;
    			}
    		}
    		map.put(i, (double) (noClears/clears));
    	}
    	int[] answer = new int[map.size()];
    	List<Entry<Integer, Double>> list = new ArrayList<>(map.entrySet());
		list.sort(Entry.comparingByValue());
		int j = 0;
		for (int i : map.keySet()) {
			answer[j] = i;
			j++;
		}
        return answer;
    }
}
