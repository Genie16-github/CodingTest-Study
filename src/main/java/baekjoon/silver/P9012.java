package baekjoon.silver;

import java.util.*;
import java.io.*;

// 괄호 (실4)
public class P9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            sb.append(solve(br.readLine())).append('\n');
        }

        System.out.println(sb);
    }

    public static String solve(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            }
            else if (stack.isEmpty()) {
                return "NO";
            }
            else {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return "YES";
        }
        else {
            return "NO";
        }
    }
}
