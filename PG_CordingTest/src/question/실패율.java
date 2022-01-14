package ch01_codingTest;


import java.util.*;
import java.util.Map.Entry;


public class 실패율 {
    public int[] solution(int N, int[] stages) {
    	ArrayList<Stage> arr = new ArrayList<>();
    	for(int i=1; i<=N; i++) {
    		int fail = 0;
    		int clear =0;
    		for (int j=0; j<stages.length; j++) {
    			if (i == stages[j]) {
    				fail++;
    			} else if( i <= stages[j]) {
    				clear++;
    			}
    		}
    		if(fail == 0 ) {
    			arr.add(new Stage(i, (double) fail));
    		} else {
    			arr.add(new Stage(i, (double) fail/clear));
    		}
    	}
    	Collections.sort(arr, ((o1, o2) -> Double.compare(o2.fail, o1.fail)));
    	int[] answer = new int[N];
        for (int i=0; i<arr.size(); i++) {
            answer[i] = arr.get(i).stage;
        }
    	
        return answer;
    }
}

class Stage {
	public int stage;
	public double fail;
	
	public Stage(int stage, double fail) {
		this.stage = stage;
		this.fail = fail;
	}

}