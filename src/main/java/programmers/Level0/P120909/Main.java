package programmers.Level0.P120909;
// 제곱수 판별하기
public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int n) {
        if (Math.sqrt(n) % 1 == 0) return 1;
        return 2;
    }
}