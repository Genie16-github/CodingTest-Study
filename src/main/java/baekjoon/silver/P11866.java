package baekjoon.silver;

import java.util.*;
import java.io.*;

// 요세푸스 문제 0 (실4)
public class P11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (!q.isEmpty()) {
            // K-1번 앞에서 꺼내서 뒤로 보냄
            for (int i = 0; i < K - 1; i++) {
                q.add(q.poll());
            }
            // K번째 사람 제거
            sb.append(q.poll());

            if (!q.isEmpty()) {
                sb.append(", ");
            }
        }

        sb.append(">");
        System.out.println(sb);
    }
}
