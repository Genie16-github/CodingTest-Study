package baekjoon.silver;

import java.io.*;

// 다음 소수 (실4)
public class P4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            long n = Long.parseLong(br.readLine());

            while (!isPrime(n)) {
                n++;
            }
            sb.append(n).append("\n");
        }

        System.out.print(sb);
    }

    // 소수 판별 함수
    private static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
