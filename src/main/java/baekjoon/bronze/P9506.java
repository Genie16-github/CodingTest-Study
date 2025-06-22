package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 약수들의 합 (브1)
public class P9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == -1) break;

            StringBuilder sb = new StringBuilder();
            sb.append("1");

            int sum = 1;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                    sb.append(" + ").append(i);
                }
            }

            if (sum == num) System.out.println(num + " = " + sb);
            else System.out.println(num + " is NOT perfect.");
        }
    }
}
