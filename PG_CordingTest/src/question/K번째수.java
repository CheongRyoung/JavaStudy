package ch01_codingTest;

import java.util.Arrays;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
    	int[] answer = new int[commands.length];
    	
    	for (int i=0; i<commands.length; i++) {
    		int[] arr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]); //반복
    		Arrays.sort(arr);
            answer[i] = arr[commands[i][2]-1]; 
    	}
        return answer;
    }
}

// 배열에러가 발생했던 원인
// 지문은 2번째, 5번째 등으로 순번이 1부터 시작했지만, 배열의 인덱스는 0부터라는 것을 간과하고 있었다.
// int[] arr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]) 마지막요소의 배열 인덱스 전까지로 배열을 자른다.
