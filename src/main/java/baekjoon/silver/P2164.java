package baekjoon.silver;

import java.util.*;
import java.io.*;

// 카드2 (실4)
public class P2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            q.add(i + 1);
        }

        while (q.size() > 1) {
            q.poll();        // 맨 위 카드 제거
            q.add(q.poll()); // 다음 카드를 맨 아래로
        }

        System.out.println(q.poll()); // 마지막 카드 출력
    }
}
