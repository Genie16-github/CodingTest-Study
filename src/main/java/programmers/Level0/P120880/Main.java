package programmers.Level0.P120880;

import java.util.Arrays;

// 특이한 정렬
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(
                new int[]{1, 2, 3, 4, 5, 6}, 4)));
        System.out.println(Arrays.toString(new Solution().solution(
                new int[]{10000, 20, 36, 47, 40, 6, 10, 7000}, 30)));
    }
}

class Solution {
    public int[] solution(int[] numlist, int n) {
        return Arrays.stream(numlist)
                .boxed()
                .sorted((a, b) -> Math.abs(a - n) == Math.abs(b - n) ? b.compareTo(a) : Integer.compare(Math.abs(a - n), Math.abs(b - n)))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}