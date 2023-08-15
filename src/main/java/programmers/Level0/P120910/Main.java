package programmers.Level0.P120910;
// 세균 증식
public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int n, int t) {
        for (int i = 0 ; i < t; i++){
            n *= 2;
        }
        return n;
    }
}