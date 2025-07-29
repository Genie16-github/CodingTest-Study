package baekjoon.silver;

import java.util.*;
import java.io.*;

// 덱 2 (실4)
public class P28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> q = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        while (N-- > 0) {
            String[] parts = br.readLine().split(" ");
            String cmd = parts[0];

            switch (cmd) {
                case "1":
                    q.addFirst(Integer.parseInt(parts[1]));
                    break;
                case "2":
                    q.addLast(Integer.parseInt(parts[1]));
                    break;
                case "3":
                    sb.append(q.isEmpty() ? -1 : q.pollFirst()).append("\n");
                    break;
                case "4":
                    sb.append(q.isEmpty() ? -1 : q.pollLast()).append("\n");
                    break;
                case "5":
                    sb.append(q.size()).append("\n");
                    break;
                case "6":
                    sb.append(q.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "7":
                    sb.append(q.isEmpty() ? -1 : q.peekFirst()).append("\n");
                    break;
                case "8":
                    sb.append(q.isEmpty() ? -1 : q.peekLast()).append("\n");
                    break;
            }
        }

        System.out.print(sb);
    }
}
