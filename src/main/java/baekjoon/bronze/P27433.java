package baekjoon.bronze;

import java.io.*;

// 팩토리얼2 (브5)
public class P27433 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(factorial(N));
    }

    private static long factorial(int n) {
        if (n <= 0) return 1;
        return n * factorial(n-1);
    }
}
