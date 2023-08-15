package programmers.Level1.P12935;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 제일 작은 수 제거하기
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(new Solution().solution(new int[]{10})));
    }
}

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};
        List<Integer> list = new ArrayList<>();
        int minA = Integer.MAX_VALUE;
        for (int a : arr) {
            minA = Math.min(minA, a);
        }
        for (int a : arr) {
            if (a != minA) list.add(a);
        }
        return list.stream().mapToInt(e -> e).toArray();
    }
}
