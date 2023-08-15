package programmers.Level1.P87389;
// 나머지가 1이 되는 수 찾기
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(10));
        System.out.println(new Solution().solution(12));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 1;
        do {
            answer++;
        } while (n % answer != 1);
        return answer;
    }
}