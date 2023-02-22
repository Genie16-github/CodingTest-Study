package ll.Level0.P120813;

// 짝수는 싫어요
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(10)));
    }
}

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            if (i % 2 != 0) al.add(i);
        }

        return al.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}
