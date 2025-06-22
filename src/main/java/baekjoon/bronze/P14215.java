package baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

// 세 막대
public class P14215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sides = new int[3];
        for (int i = 0; i < 3; i++) {
            sides[i] = sc.nextInt();
        }

        Arrays.sort(sides);

        int res = (sides[0] + sides[1] > sides[2])
                ? sides[0] + sides[1] + sides[2]
                : (sides[0] + sides[1]) * 2 - 1;

        System.out.println(res);
    }
}
