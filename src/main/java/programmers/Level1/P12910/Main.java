package programmers.Level1.P12910;

import java.util.ArrayList;
import java.util.Arrays;

// 나누어 떨어지는 숫자 배열
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(
                new int[]{5, 9, 7, 10}, 5
        )));
        System.out.println(Arrays.toString(new Solution().solution(
                new int[]{2, 36, 1, 3}, 1
        )));
        System.out.println(Arrays.toString(new Solution().solution(
                new int[]{3, 2, 6}, 10
        )));
    }
}

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr);
        for (int a : arr) {
            if (a % divisor == 0) answer.add(a);
        }

        return (answer.size() == 0) ? new int[]{-1} : answer.stream().mapToInt(e -> e).toArray();
    }
}