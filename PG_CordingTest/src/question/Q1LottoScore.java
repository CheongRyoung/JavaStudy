package question;

class Q1LottoScore {
    public int[] solution(int[] lottos, int[] win_nums) {
        int sum = 0;
        int correct = 0;
                
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
        int max = num(sum+correct);
        int min = num(correct);
        int[] result = {max, min};
        return result;
        
    }
    public int num(int count) {
        int grade;
        switch(count) {
        case 6:
            grade = 1;
            break;
        case 5:
            grade = 2;
            break;
        case 4:
            grade = 3;
            break;
        case 3:
            grade = 4;
            break;
        case 2:
            grade = 5;
            break;
        default:
            grade = 6;
            break;
        }
        return grade;
    }
}