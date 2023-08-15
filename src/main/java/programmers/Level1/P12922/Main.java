package programmers.Level1.P12922;
// 수박수박수박수박수박수?
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(3));
        System.out.println(new Solution().solution(4));
    }
}

class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i < n + 1; i++) {
            if (i % 2 != 0) answer.append("수");
            else answer.append("박");
        }
        return answer.toString();
    }
}