package baekjoon.silver;

import java.io.*;

// 골드바흐 파티션 (실2)
public class P17103 {
    public static final int MAX = 1000000;
    public static boolean[] isNotPrime = new boolean[MAX + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        findPrime();

        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;

            for (int i = 2; i <= n / 2; i++) {
                if (!isNotPrime[i] && !isNotPrime[n - i]) {
                    count++;
                }
            }

            sb.append(count).append("\n");
        }

        System.out.print(sb);
    }

    // 에라토스테네스의 체
    public static void findPrime() {
        isNotPrime[0] = isNotPrime[1] = true;
        for (int i = 2; i * i <= MAX; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
    }
}
