package baekjoon.bronze;

import java.util.*;
import java.io.*;

// 이항 계수 1
public class P11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long res = factorial(N) / (factorial(K) * factorial(N-K));
        System.out.println(res);
    }

    private static long factorial(int n) {
        if (n == 0) return 1;
        else return n * factorial(n-1);
    }
}
