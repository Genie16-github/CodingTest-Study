package ll.Level0.P120899;

import java.util.Arrays;

// 가장 큰 수 찾기
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new int[]{1, 8, 3})));
    }
}

class Solution {
    public int[] solution(int[] array) {
        int answer = 0;
        int idx = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > answer){
                answer = array[i];
                idx = i;
            }
        }

        return new int[]{answer, idx};
    }
}