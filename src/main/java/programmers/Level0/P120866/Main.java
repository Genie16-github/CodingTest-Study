package programmers.Level0.P120866;

// 안전지대
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(
                new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}}
        ));
    }
}

class Solution {
    public int solution(int[][] board) {
        int[] dx = {0, 0, -1, 1, -1, -1, 1, 1};
        int[] dy = {1, -1, 0, 0, 1, -1, 1, -1};

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    for (int k = 0; k < 8; k++){
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if (nx >= 0 && nx < board.length && ny >= 0 && ny < board.length && board[nx][ny] != 1) {
                            board[nx][ny] = 2;
                        }
                    }
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0) sum++;
            }
        }
        return sum;
    }
}
