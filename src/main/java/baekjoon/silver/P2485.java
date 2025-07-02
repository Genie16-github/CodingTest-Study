package baekjoon.silver;

import java.io.*;

// 가로수 (실4)
public class P2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] trees = new int[N];
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }

        int[] diffs = new int[N-1];
        for (int i = 0; i < N-1; i++) {
            diffs[i] = trees[i+1] - trees[i];
        }

        int interval = diffs[0];
        for (int i = 1; i < diffs.length; i++) {
            interval = gcd(interval, diffs[i]);
        }

        int res = (trees[N-1] - trees[0]) / interval + 1 - N;
        System.out.println(res);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
