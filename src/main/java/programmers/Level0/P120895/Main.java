package programmers.Level0.P120895;

// 인덱스 바꾸기
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("hello", 1, 2));
    }
}

class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder();
        char[] str = my_string.toCharArray();
        char tmp = str[num1];
        str[num1] = str[num2];
        str[num2] = tmp;
        for (char c : str) sb.append(c);
        return sb.toString();
    }
}