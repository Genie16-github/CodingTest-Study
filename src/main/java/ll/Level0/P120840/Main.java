package ll.Level0.P120840;
// 구슬을 나누는 경우의 수
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(3, 2));
        System.out.println(new Solution().solution(5, 3));
    }
}

class Solution {
    public int solution(int balls, int share) {
        return combination(balls, share);
    }

    public static int combination(int balls, int share) {
        if (balls == share || share == 0) return 1;
        return combination((balls - 1), (share - 1)) + combination(balls - 1, share);
    }
}