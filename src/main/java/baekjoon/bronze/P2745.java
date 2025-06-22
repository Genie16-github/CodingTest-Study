package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 진법 변환 (브2)
public class P2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken(); // B진법 수
        int b = Integer.parseInt(st.nextToken()); // 진법

        // B진법 -> 10진법으로 변환
        int res = Integer.parseInt(n, b);

        // 결과 출력
        System.out.println(res);
    }
}
