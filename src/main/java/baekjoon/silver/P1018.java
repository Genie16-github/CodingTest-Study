package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 체스판 다시 칠하기 (실4)
public class P1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] map = new String[N];
        for (int i = 0; i < N; i++) {
            map[i] = br.readLine();
        }

        int res = Integer.MAX_VALUE;
        String[] board = {"WBWBWBWB", "BWBWBWBW"};

        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {

                int cnt = 0;

                for (int k = 0; k < 8; k++) {
                    int row = i + k;
                    for (int l = 0; l < 8; l++) {
                        int col = j + l;
                        if (map[row].charAt(col) != board[row % 2].charAt(l)) cnt++;
                    }
                }

                res = Math.min(res, Math.min(cnt, 64 - cnt));
            }
        }

        System.out.println(res);
    }
}
