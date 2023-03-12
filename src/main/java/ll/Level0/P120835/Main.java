package ll.Level0.P120835;

import java.util.*;

// 진료순서 정하기
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new int[]{3, 76, 24})));
    }
}

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for(int i = 0; i < answer.length; i++){
            if(answer[i] != 0){
                continue;
            }
            int idx = 1;
            for(int j = 0; j < answer.length; j++){
                if(emergency[i] < emergency[j]){
                    idx++;
                }
            }
            answer[i] = idx;
        }
        return answer;
    }
}