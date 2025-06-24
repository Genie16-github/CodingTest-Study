package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 분해합 (브2)
public class P2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = 0;
        int len = String.valueOf(N).length();
        int start = Math.max(N - 9 * len, 0);

        for (int i = start; i < N; i++) {
            int num = i;
            int res = 0;

            while (num > 0) {
                res += num % 10;
                num /= 10;
            }

            if (res + i == N) {
                M = i;
                break;
            }
        }

        System.out.println(M);
    }
}
