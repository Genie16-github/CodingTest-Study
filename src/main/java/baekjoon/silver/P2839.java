package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 설탕 배달 (실4)
public class P2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int res = Integer.MAX_VALUE;

        for (int i = 0; i <= N / 5; i++) {
            int rest = N - (i * 5);
            if (rest % 3 == 0) {
                int j = rest / 3;
                res = Math.min(res, i + j);
            }
        }

        System.out.println(res == Integer.MAX_VALUE ? -1 : res);
    }
}
