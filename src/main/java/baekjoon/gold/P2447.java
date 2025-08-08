package baekjoon.gold;

import java.util.*;
import java.io.*;

// 별 찍기 - 10 (골5)
public class P2447 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        char[][] board = new char[N][N];
        for (int i = 0; i < N; i++) Arrays.fill(board[i], '*');

        solve(board, 0, 0, N);

        StringBuilder sb = new StringBuilder(N * (N + 1));
        for (int i = 0; i < N; i++) {
            sb.append(board[i]);
            sb.append('\n');
        }
        System.out.print(sb);
    }

    static void solve(char[][] board, int x, int y, int size) {
        if (size == 1) return;

        int block = size / 3;

        // 가운데 블록 공백 처리
        for (int i = x + block; i < x + 2 * block; i++) {
            for (int j = y + block; j < y + 2 * block; j++) {
                board[i][j] = ' ';
            }
        }

        // 8개 영역 재귀 (가운데는 건너뜀)
        for (int dx = 0; dx < 3; dx++) {
            for (int dy = 0; dy < 3; dy++) {
                if (dx == 1 && dy == 1) continue; // 가운데
                solve(board, x + dx * block, y + dy * block, block);
            }
        }
    }
}
