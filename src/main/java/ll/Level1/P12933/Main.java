package ll.Level1.P12933;

import java.util.Arrays;

// 정수 내림차순으로 배치하기
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(118372));
    }
}

class Solution {
    public long solution(long n) {
        StringBuilder sb = new StringBuilder();
        char[] str = String.valueOf(n).toCharArray();
        Arrays.sort(str);
        for (int i = str.length-1; i > -1; i--) {
            sb.append(str[i]);
        }
        return Long.parseLong(sb.toString());
    }
}
