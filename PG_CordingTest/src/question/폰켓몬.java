package ch01_codingTest;

// list에서 중복된 것을 제외한 값을 넣고 싶을 때는 굳이 arrayList 보다는 set을 사용하자

import java.util.ArrayList;
import java.util.List;

public class 폰켓몬 {
    public int solution(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<nums.length; i++) {
            if (list.indexOf(nums[i]) == -1) {
                list.add(nums[i]);
            }
        }
        int answer = list.size();
        if (list.size() > nums.length/2) {
            answer = nums.length/2;
        }
        return answer;
    }
}
