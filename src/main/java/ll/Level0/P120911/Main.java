package ll.Level0.P120911;

import java.util.Arrays;

// 문자열 정렬하기(2)
public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        char[] res = my_string.toLowerCase().toCharArray();
        Arrays.sort(res);
        for (char c : res) sb.append(c);

        return sb.toString();
    }
}
