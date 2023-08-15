package programmers.Level0.P120843;

import java.util.LinkedList;
import java.util.Queue;

// 공 던지기
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 2, 3, 4}, 2));
        System.out.println(new Solution().solution(new int[]{1, 2, 3, 4, 5, 6}, 5));
        System.out.println(new Solution().solution(new int[]{1, 2, 3}, 3));
    }
}

class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int num : numbers) q.offer(num);
        for (int i = 0; i < k-1; i++) {
            q.offer(q.poll());
            q.offer(q.poll());
        }
        if (!q.isEmpty()) {
            answer = q.poll();
        }
        return answer;
    }
}