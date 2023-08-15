package programmers.Level0.P120924;
// 다음에 올 숫자
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 2, 3, 4}));
        System.out.println(new Solution().solution(new int[]{2, 4, 8}));
    }
}

class Solution {
    public int solution(int[] common) {
        int answer;
        if (common[1] - common[0] == common[2] - common[1]) {
            answer = common[common.length - 1] + (common[1] - common[0]);
        } else {
            answer = common[common.length - 1] * (common[1] / common[0]);
        }
        return answer;
    }
}