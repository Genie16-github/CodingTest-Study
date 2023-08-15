package programmers.Level2.P72412;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(
                new String[]{"java backend junior pizza 150", "python frontend senior chicken 210", "python frontend senior chicken 150", "cpp backend senior pizza 260", "java backend junior chicken 80", "python backend senior chicken 50"},
                new String[]{"java and backend and junior and pizza 100", "python and frontend and senior and chicken 200", "cpp and - and senior and pizza 250", "- and backend and senior and - 150", "- and - and - and chicken 100", "- and - and - and - 150"}
        )));
    }
}

class Solution {
    public int[] solution(String[] info, String[] query) {
        List<Integer> ans = new ArrayList<>();
        for (String q : query) {
            String[] data = q.split(" and ");
            int cut = Integer.parseInt(data[3].split(" ")[1]);
            data[3] = data[3].split(" ")[0];
            boolean chk = true;
            int cnt = 0;
            for (String str : info) {
                String[] app = str.split(" ");
                if (Integer.parseInt(app[4]) < cut) continue;
                for (int i = 0; i < app.length-1; i++) {
                    chk = true;
                    if (!data[i].equals(app[i]) && !data[i].equals("-")) {
                        chk = false;
                        break;
                    }
                }
                if (chk) cnt++;
            }
            ans.add(cnt);
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}