package programmers.Level0.P120890;

import java.util.Arrays;

// 가까운 수
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{10,11,12}, 13));
    }
}

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int diff = 2147000;
        Arrays.sort(array);
        for (int num : array){
            if (Math.abs(num - n) < diff) {
                diff = Math.abs(num - n);
                answer = num;
            }
        }
        return answer;
    }
}