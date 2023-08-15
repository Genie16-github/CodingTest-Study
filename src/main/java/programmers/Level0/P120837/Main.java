package programmers.Level0.P120837;
// 개미 군단
public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int hp) {
        int answer = 0;
        answer += hp / 5;
        hp = hp % 5;
        answer += hp / 3;
        hp = hp % 3;
        answer += hp;

        return answer;
    }
}
