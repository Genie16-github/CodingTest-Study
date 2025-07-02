package baekjoon.silver;

import java.io.*;

// 베르트랑 공준 (실2)
public class P4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            int cnt = 0;
            if (n == 1) cnt++;

            for (int i = n + 1; i < 2 * n; i++) {
                if (isPrime(i)) cnt++;
            }

            System.out.println(cnt);
        }
    }

    public static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
