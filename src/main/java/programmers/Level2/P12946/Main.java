package programmers.Level2.P12946;

import java.util.ArrayList;
import java.util.Arrays;

// 하노이의 탑
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Solution().solution(4)));
    }
}

class Solution {

    ArrayList<int[]> list;

    public int[][] solution(int n) {
        list = new ArrayList<>();
        hanoi(1, 2, 3, n); //n개의 원판을 1에서 시작 -> 2를 거쳐 -> 3으로 옮긴다.
        int[][] result = new int[list.size()][2];
        for(int i = 0; i < list.size(); i++) {
            result[i][0] = list.get(i)[0];
            result[i][1] = list.get(i)[1];
        }
        return result;
    }

    public void hanoi(int s, int v, int e, int n) {
        int[] move = {s, e};

        if(n == 1) list.add(move);
        else {
            hanoi(s, e, v, n - 1);  // n-1 개를 from 에서 empty 로
            list.add(move);             // 1개를 from 에서 to 로
            hanoi(v, s, e, n - 1);  // n-1 개를 empty 에서 to 로
        }
    }
}