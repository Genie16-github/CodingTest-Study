package baekjoon.bronze;

import java.io.*;

// 녹색거탑 (브4)
public class P24723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println((int)Math.pow(2, N));
    }
}
