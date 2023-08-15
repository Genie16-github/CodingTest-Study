package programmers.Level0.P120907;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// OX 퀴즈
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(
                new String[]{"3 - 4 = -3", "5 + 6 = 11"}
        )));
        System.out.println(Arrays.toString(new Solution().solution(
                new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"}
        )));
    }
}

class Solution {
    public String[] solution(String[] quiz) {
        List<String> list = new ArrayList<>();
        for (String q : quiz) {
            String[] mod = q.split(" ");
            int tmp;
            String res;
            switch (mod[1]) {
                case "+" -> {
                    tmp = Integer.parseInt(mod[0]) + Integer.parseInt(mod[2]);
                    res = (tmp == Integer.parseInt(mod[4])) ? "O" : "X";
                    list.add(res);
                }
                case "-" -> {
                    tmp = Integer.parseInt(mod[0]) - Integer.parseInt(mod[2]);
                    res = (tmp == Integer.parseInt(mod[4])) ? "O" : "X";
                    list.add(res);
                }
                default -> {
                }
            }
        }
        return list.toArray(new String[0]);
    }
}