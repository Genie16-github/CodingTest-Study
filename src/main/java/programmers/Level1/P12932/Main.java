package programmers.Level1.P12932;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 자연수 뒤집어 배열로 만들기
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(12345)));
    }
}

class Solution {
    public int[] solution(long n) {
        String[] s = String.valueOf(n).split("");
        List<Integer> list = new ArrayList<>();
        for (int i = s.length-1; i > -1; i--) {
            list.add(Integer.parseInt(s[i]));
        }
        return list.stream().mapToInt(e -> e).toArray();
    }
}