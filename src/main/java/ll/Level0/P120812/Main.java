package ll.Level0.P120812;

// 최빈값 구하기
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 2, 3, 3, 3, 4}));
        System.out.println(new Solution().solution(new int[]{1, 1, 2, 2}));
        System.out.println(new Solution().solution(new int[]{1}));
    }
}

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int maxCnt = 0;
        int[] cnt = new int[1001];
        for (int num : array) {
            cnt[num]++;
            if (maxCnt < cnt[num]) {
                maxCnt = cnt[num];
                answer = num;
            }
        }
        int res = 0;
        for (int c : cnt) {
            if (c == maxCnt) res++;
        }

        if (res > 1) return -1;

        return answer;
    }
}