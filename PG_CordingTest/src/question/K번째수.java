package ch01_codingTest;

import java.util.Arrays;

public class K��°�� {
    public int[] solution(int[] array, int[][] commands) {
    	int[] answer = new int[commands.length];
    	
    	for (int i=0; i<commands.length; i++) {
    		int[] arr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]); //�ݺ�
    		Arrays.sort(arr);
            answer[i] = arr[commands[i][2]-1]; 
    	}
        return answer;
    }
}

// �迭������ �߻��ߴ� ����
// ������ 2��°, 5��° ������ ������ 1���� ����������, �迭�� �ε����� 0���Ͷ�� ���� �����ϰ� �־���.
// int[] arr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]) ����������� �迭 �ε��� �������� �迭�� �ڸ���.
