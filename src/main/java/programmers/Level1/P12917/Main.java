package programmers.Level1.P12917;

import java.util.Arrays;

// 문자열 내림차순으로 배치하기
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("Zbcdefg"));
    }
}

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new StringBuilder(new String(arr)).reverse().toString();
    }
}