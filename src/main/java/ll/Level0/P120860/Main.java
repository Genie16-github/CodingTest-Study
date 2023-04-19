package ll.Level0.P120860;
// 직사각형 넓이 구하기
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(
                new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}})
        );
        System.out.println(new Solution().solution(
                new int[][]{{-1, -1}, {1, 1}, {1, -1}, {-1, 1}})
        );
    }
}

class Solution {
    public int solution(int[][] dots) {
        int maxX = -256; int maxY = -256;
        int minX = 256; int minY = 256;
        for (int[] dot : dots) {
            maxX = Math.max(maxX, dot[0]);
            minX = Math.min(minX, dot[0]);
            maxY = Math.max(maxY, dot[1]);
            minY = Math.min(minY, dot[1]);
        }
        return (maxX - minX) * (maxY - minY);
    }
}