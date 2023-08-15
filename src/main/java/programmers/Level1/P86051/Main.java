package programmers.Level1.P86051;

import java.util.ArrayList;
import java.util.List;

// 없는 숫자 더하기
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
        System.out.println(new Solution().solution(new int[]{5, 8, 4, 0, 6, 7, 9}));
    }
}

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int n : numbers) list.add(n);

        for (int i = 0; i < 10; i++) {
            if (!list.contains(i)) answer += i;
        }
        return answer;
    }
}