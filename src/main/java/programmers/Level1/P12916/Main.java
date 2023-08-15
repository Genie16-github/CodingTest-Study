package programmers.Level1.P12916;

// 문자열 내 p와 y의 개수
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("pPoooyY"));
        System.out.println(new Solution().solution("Pyy"));
    }
}

class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
//        int a = 0; int b = 0;
//        for (char c : s.toCharArray()) {
//            if (c == 'p') a++;
//            if (c == 'y') b++;
//        }
//        return a == b;
        return s.chars().filter(e -> e == 'p').count() == s.chars().filter(e -> e == 'y').count();
    }
}