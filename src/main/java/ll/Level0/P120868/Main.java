package ll.Level0.P120868;
// 삼각형의 완성조건 (2)
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 2}));
        System.out.println(new Solution().solution(new int[]{3, 6}));
        System.out.println(new Solution().solution(new int[]{11, 7}));
    }
}

class Solution {
    public int solution(int[] sides) {
        return (sides[0] + sides[1]) - (Math.abs(sides[0] - sides[1])) - 1;
    }
}