package ll.Level0.P120852;

import java.util.*;

// 소인수분해
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(12)));
    }
}

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int i = 2;

        while (n >= 2) {
            if (n % i == 0) {
                list.add(i);
                n /= i;
            } else {
                i++;
            }
        }
        answer = list.stream().distinct().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}