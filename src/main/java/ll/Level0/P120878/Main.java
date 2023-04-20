package ll.Level0.P120878;
// 유한소수 판별하기
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(7, 20));
        System.out.println(new Solution().solution(11, 22));
        System.out.println(new Solution().solution(12, 21));
    }
}

class Solution {
    public int solution(int a, int b) {
        int den = b / gcd(a, b);

        while (den != 1) {
            if (den % 2 == 0) {
                den /= 2;
            } else if (den % 5 == 0) {
                den /= 5;
            } else {
                return 2;
            }
        }

        return 1;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
