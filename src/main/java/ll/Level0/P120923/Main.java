package ll.Level0.P120923;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 연속된 수의 합
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(3, 12)));
        System.out.println(Arrays.toString(new Solution().solution(5, 15)));
        System.out.println(Arrays.toString(new Solution().solution(4, 14)));
        System.out.println(Arrays.toString(new Solution().solution(5, 5)));
    }
}

class Solution {
    public int[] solution(int num, int total) {
        List<Integer> ans = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += i;
        }
        int x = (total - sum) / num;
        for (int i = 0; i < num; i++) ans.add(x + i);
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
