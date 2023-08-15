package programmers.Level1.P12912;
// 두 정수 사이의 합
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(3, 5));
        System.out.println(new Solution().solution(3, 3));
        System.out.println(new Solution().solution(5, 3));
    }
}

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        for (int i = a; i < b+1; i++) {
            answer += i;
        }
        return answer;
    }
}