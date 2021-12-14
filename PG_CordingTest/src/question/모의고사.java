package ch01_codingTest;

// �ݺ��Ǵ� ���ڸ� �ε����� ������ �迭�� �ִ� ����� �������� Ȱ���ϴ� ��� >> answers[i] == supo1[i%5]
// Math.max�� parameter�� �ΰ��� �ʰ��� �� ����. �׷��� ������ max�� �ȿ� max�� �־ ���� �̻��� ���� �� �ִ�. ��ʸ�Ʈ ����
// LIST�� int[]�� ���� primitive Ÿ���� ������ list.toArray(Object); ����� �� ����. for���� ���� �������� �ٲ� �� �ִ�.
import java.util.ArrayList;
import java.util.List;

public class ���ǰ�� {
	public int[] solution(int[] answers) {
		int[] supo1 ={1, 2, 3, 4, 5};
		int correct1 = 0;
		int[] supo2 ={2, 1, 2, 3, 2, 4, 2, 5};
		int correct2 = 0;
		int[] supo3 ={3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int correct3 = 0;
		for(int i=0; i<answers.length; i++) {
			if (answers[i] == supo1[i%5]) {
				correct1++;
			}
			if (answers[i] == supo2[i%8]) {
				correct2++;
			}
			if (answers[i] == supo3[i%10]) {
				correct3++;
			}
		}
		int[] corrects = {correct1, correct2, correct3};
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<corrects.length; i++){
			if(Math.max(Math.max(correct1, correct2 ), correct3) == corrects[i]) {
				list.add(i+1);
			}
		}
		int[] answer = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}

