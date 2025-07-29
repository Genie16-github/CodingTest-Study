package baekjoon.silver;

import java.io.*;
import java.util.*;

// queuestack (실3)
public class P24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] types = br.readLine().split(" ");
        String[] values = br.readLine().split(" ");

        Deque<Integer> queueValues = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            if (types[i].equals("0")) {
                // 큐(0)인 구조의 값만 저장
                queueValues.addLast(Integer.parseInt(values[i]));
            }
        }

        int M = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int input = Integer.parseInt(inputs[i]);
            queueValues.addFirst(input); // 입력값은 제일 앞에서 시작

            // 출력은 맨 뒤에서 나온 값
            sb.append(queueValues.pollLast()).append(" ");
        }

        System.out.println(sb);
    }
}
