package programmers.Level0.P120829;

// 각도기

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public int solution(int angle) {
        if (angle == 180) return 4;
        else if (angle > 90) return 3;
        else if (angle == 90) return 2;
        return 1;
    }
}