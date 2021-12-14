package ch01_codingTest;

// 반복되는 숫자를 인덱스가 정해진 배열에 넣는 방법은 나머지를 활용하는 방법 >> answers[i] == supo1[i%5]
// Math.max의 parameter는 두개를 초과할 수 없다. 그렇기 때문에 max문 안에 max를 넣어서 세개 이상을 비교할 수 있다. 토너먼트 느낌
// LIST를 int[]와 같은 primitive 타입의 변수를 list.toArray(Object); 사용할 수 없다. for문을 통해 수동으로 바꿀 수 있다.
import java.util.ArrayList;
import java.util.List;

public class 모의고사 {
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

