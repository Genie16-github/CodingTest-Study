package programmers.Level0.P120884;
// 치킨 쿠폰
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(100));
        System.out.println(new Solution().solution(1081));
    }
}

class Solution {
    public int solution(int chicken) {
        int answer = 0;
        while (chicken > 9) {
            answer += chicken / 10;
            chicken = chicken / 10 + chicken % 10;
        }
        return answer;
    }
}