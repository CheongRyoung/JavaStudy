package programers;

public class 로또최소최대당첨 {
    public static void main(String[] args) {
    	int[] lottos = {44,1,0,0,31,25};
    	int[] win_nums = {31,10,45,1,6,19};
    	
    	solution(lottos, win_nums);
    	int[] result = solution(lottos, win_nums);
    	for(int i : result) {
    		System.out.print(i+"입니다.");
    	}
    }
	public static int[] solution(int[] lottos, int[] win_nums) {
        int sum = 0;
        int correct = 0;
        int max = 0;
        int min = 0;
        
        for(int i : lottos) {
            if (i == 0) {
                sum += 1;
             
            }
            for (int j: win_nums) {
                if (i == j) {
                    correct += 1;

                }
            }
        }
        switch(sum+correct) {
        case 6:
            max = 1;
            break;
        case 5:
            max = 2;
            break;
        case 4:
            max = 3;
            break;
        case 3:
            max = 4;
            break;
        case 2:
            max = 5;
            break;
        default:
            max = 6;
            break;
        }
        switch(sum) {
        case 6:
            min = 1;
            break;
        case 5:
            min = 2;
            break;
        case 4:
            min = 3;
            break;
        case 3:
            min = 4;
            break;
        case 2:
            min = 5;
            break;
        default:
            min = 6;
            break;
        }
        int[] result = {max, min};
        return result;
    }
}