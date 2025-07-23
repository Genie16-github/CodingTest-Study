package baekjoon.silver;

import java.util.*;
import java.io.*;

// 큐 2 (실4)
public class P18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> q = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer command;

        while(N-- > 0) {
            command = new StringTokenizer(br.readLine(), " ");	// 문자열 분리
            Integer num;
            switch(command.nextToken()) {

                case "push":
                    q.offer(Integer.parseInt(command.nextToken()));
                    break;

                case "pop" :
                    num = q.poll();
                    if(num == null) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(num).append('\n');
                    }
                    break;

                case "size":
                    sb.append(q.size()).append('\n');
                    break;

                case "empty":
                    if(q.isEmpty()) {
                        sb.append(1).append('\n');
                    }
                    else {
                        sb.append(0).append('\n');
                    }
                    break;

                case "front":
                    num = q.peek();
                    if(num == null) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(num).append('\n');
                    }
                    break;

                case "back":
                    num = q.peekLast();
                    if(num == null) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(num).append('\n');
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
