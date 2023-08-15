package programmers.Level1.P12937;
// 짝수와 홀수
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(3));
        System.out.println(new Solution().solution(4));
    }
}

class Solution {
    public String solution(int num) {
        if (num % 2 == 0) return "Even";
        return "Odd";
    }
}