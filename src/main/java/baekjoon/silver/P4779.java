package baekjoon.silver;

import java.io.*;

// 칸토어 집합(실3)
public class P4779 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            int N = Integer.parseInt(line);
            int length = (int) Math.pow(3, N);
            char[] result = new char[length];

            for (int i = 0; i < length; i++) {
                result[i] = '-';
            }

            // 재귀적으로 공백 만들기
            cantorSet(result, 0, length);

            System.out.println(new String(result));
        }
    }

    private static void cantorSet(char[] arr, int start, int length) {
        if (length < 3) return;

        int third = length / 3;

        // 가운데 공백 만들기
        for (int i = start + third; i < start + 2 * third; i++) {
            arr[i] = ' ';
        }

        // 왼쪽, 오른쪽 재귀 호출
        cantorSet(arr, start, third);                 // 왼쪽
        cantorSet(arr, start + 2 * third, third);     // 오른쪽
    }
}
