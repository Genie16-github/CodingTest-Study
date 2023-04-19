package ll.Level0.P120861;

import java.util.Arrays;

// 캐릭터의 좌표
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(
                new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11}))
        );
        System.out.println(Arrays.toString(new Solution().solution(
                new String[]{"down", "down", "down", "down", "down"}, new int[]{7, 9}))
        );
    }
}

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int weight = board[0] / 2;
        int height = board[1] / 2;
        int x = 0; int y = 0;
        for (String input : keyinput) {
            int nx = x;
            int ny = y;
            switch (input) {
                case "left" -> nx = x - 1;
                case "right" -> nx = x + 1;
                case "up" -> ny = y + 1;
                default -> ny = y - 1;
            }
            if (nx >= -weight && nx <= weight && ny >= -height && ny <= height) {
                x = nx;
                y = ny;
            }
        }
        return new int[]{x, y};
    }
}