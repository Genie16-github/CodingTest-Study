package programmers.Level0.P120864;
// 숨어있는 숫자의 덧셈(2)
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("aAb1B2cC34oOp"));
    }
}

class Solution {
    public int solution(String my_string) {
        int res = 0;
        String[] str = my_string.split("[a-zA-Z]");
        for (String s : str) {
            if (!s.isEmpty()) res += Integer.parseInt(s);
        }
        return res;
    }
}
