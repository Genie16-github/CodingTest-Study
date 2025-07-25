package baekjoon.bronze;

import java.util.Scanner;

// 네 번째 점 (브3)
public class P3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int resX = (x[0] == x[1]) ? x[2] : (x[0] == x[2] ? x[1] : x[0]);
        int resY = (y[0] == y[1]) ? y[2] : (y[0] == y[2] ? y[1] : y[0]);

        System.out.println(resX + " " + resY);
    }
}
