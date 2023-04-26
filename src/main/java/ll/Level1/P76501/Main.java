package ll.Level1.P76501;
// 음양 더하기
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(
                new int[]{4, 7, 12}, new boolean[]{true, false, true}
        ));
        System.out.println(new Solution().solution(
                new int[]{1, 2, 3}, new boolean[]{false, false, true}
        ));
    }
}

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < signs.length; i++) {
            if (!signs[i]) absolutes[i] = -absolutes[i];
            answer += absolutes[i];
        }
        return answer;
    }
}