package ll.Level0.P120876;

// 겹치는 선분의 길이
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(
                new int[][]{{0, 1}, {2, 5}, {3, 9}}
        ));
        System.out.println(new Solution().solution(
                new int[][]{{-1, 1}, {1, 3}, {3, 9}}
        ));
        System.out.println(new Solution().solution(
                new int[][]{{0, 5}, {3, 9}, {1, 10}}
        ));
    }
}

class Solution {
    public int solution(int[][] lines) {
        int[] arr = new int[200];
        int answer = 0;
        for (int[] line : lines) {
            int a = line[0] + 100;
            int b = line[1] + 100;
            for (int i = a; i < b; i++) {
                arr[i]++;
            }
        }

        for (int i : arr) {
            if (i > 1) answer++;
        }
        return answer;
    }
}

