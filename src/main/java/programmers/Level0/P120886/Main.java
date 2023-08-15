package programmers.Level0.P120886;

import java.util.Arrays;

// A로 B 만들기
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("olleh", "hello"));
    }
}

class Solution {
    public int solution(String before, String after) {
        char[] cBefore = before.toCharArray();
        char[] cAfter = after.toCharArray();

        Arrays.sort(cBefore);
        Arrays.sort(cAfter);

        return Arrays.equals(cBefore, cAfter) ? 1 : 0;
    }
}