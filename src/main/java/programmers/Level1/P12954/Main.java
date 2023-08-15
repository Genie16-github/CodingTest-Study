package programmers.Level1.P12954;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// x만큼 간격이 있는 n개의 숫자
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(2, 5)));
        System.out.println(Arrays.toString(new Solution().solution(4, 3)));
        System.out.println(Arrays.toString(new Solution().solution(-4, 2)));
    }
}

class Solution {
    public long[] solution(int x, int n) {
        List<Long> list = new ArrayList<>();
        for (int i = 1; i < n+1; i++) {
            list.add((long)x*i);
        }
        return list.stream().mapToLong(e -> e).toArray();
    }
}