package programmers.Level0.P120842;

import java.util.Arrays;

// 2차원으로 만들기
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Solution().solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2)));
    }
}

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int cnt = 0;

        for(int i = 0; i < (num_list.length/n); i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[cnt];
                cnt++;
            }
        }
        return answer;
    }
}