package ll.Level1.P12928;
// 약수의 합
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(12));
        System.out.println(new Solution().solution(5));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer += i;
        }
        return answer;
    }
}