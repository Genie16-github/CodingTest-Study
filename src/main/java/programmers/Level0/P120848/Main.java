package programmers.Level0.P120848;
// 팩토리얼
public class Main {
}

class Solution {
    public static int fac(int n) {
        if(n == 1) return 1;
        return n * fac(n-1);
    }

    public int solution(int n) {
        int answer = 0;
        for(int i = 10; i > 0; i--) {
            if(fac(i) <= n) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}