package programmers.Level2.P42586;

import java.util.*;

// 기능개발
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(
                new int[]{93, 30, 55}, new int[]{1, 30, 5}
        )));
        System.out.println(Arrays.toString(new Solution().solution(
                new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1}
        )));
    }
}

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> s = new LinkedList<>();
        for (int p : progresses) q.offer(p);
        for (int speed : speeds) s.offer(speed);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int speed : s) q.offer(q.poll() + speed);
            int cnt = 0;
            while (q.peek() != null && q.peek() > 99) {
                q.poll();
                s.poll();
                cnt++;
            }
            if (q.size() != size) answer.add(cnt);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}