package ll.Level1.P12925;
// 문자열을 정수로 바꾸기
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("1234"));
        System.out.println(new Solution().solution("+1234"));
        System.out.println(new Solution().solution("-1234"));
    }
}

class Solution {
    public int solution(String s) {
        if (s.charAt(0) == '+') s = s.replace("+", "");
        return Integer.parseInt(s);
    }
}