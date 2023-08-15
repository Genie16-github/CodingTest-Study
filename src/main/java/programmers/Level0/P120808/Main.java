package programmers.Level0.P120808;

import java.util.Arrays;

// 분수의 덧셈
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                new Solution().solution(1, 2, 3, 4)));
        System.out.println(Arrays.toString(
                new Solution().solution(9, 2, 1, 3)));
    }
}

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer;
        int bottom = denom1 * denom2;
        int top = (numer1 * denom2) + (numer2 * denom1);
        int n = gcd(top, bottom);
        answer = new int[]{top / n, bottom / n};
        return answer;
    }

    public int gcd(int a, int b){
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}