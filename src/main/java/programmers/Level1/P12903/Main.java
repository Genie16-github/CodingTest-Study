package programmers.Level1.P12903;
// 가운데 글자 가져오기
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("abcde"));
        System.out.println(new Solution().solution("qwer"));
    }
}

class Solution {
    public String solution(String s) {
        int num = s.length() / 2;
        if (s.length() % 2 == 0) s = s.substring(num - 1, num + 1);
        else s = String.valueOf(s.charAt(num));
        return s;
    }
}