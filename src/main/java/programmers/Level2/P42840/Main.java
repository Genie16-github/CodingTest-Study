package programmers.Level2.P42840;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 모의고사
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(new Solution().solution(new int[]{1, 3, 2, 4, 2})));
    }
}

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {0, 0, 0};
        int[] person1 = new int[]{1, 2, 3, 4, 5};
        int[] person2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == person1[i%5]) answer[0]++;
            if (answers[i] == person2[i%8]) answer[1]++;
            if (answers[i] == person3[i%10]) answer[2]++;
        }
        int maxS = Integer.MIN_VALUE;
        for (int a : answer) {
            maxS = Math.max(maxS, a);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == maxS) list.add(i+1);
        }
        return list.stream().mapToInt(e -> e).toArray();
    }
}