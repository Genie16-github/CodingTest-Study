package programmers.Level0.P120922;
// 종이 자르기
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(2, 2));
        System.out.println(new Solution().solution(2, 5));
        System.out.println(new Solution().solution(1, 1));
    }
}

class Solution {
    public int solution(int M, int N) {
        return (N-1) * M + (M-1);
    }
}