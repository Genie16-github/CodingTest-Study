package programmers.Level1.P12943;
// 콜라츠 추측
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(6));
        System.out.println(new Solution().solution(16));
        System.out.println(new Solution().solution(626331));
    }
}

class Solution {
    public int solution(long num) {
        if (num == 1) return 0;
        for (int i = 0; i < 500; i++) {
            if (num == 1){
                return i;
            }
            if (num % 2 == 0) num /= 2;
            else num = num * 3 + 1;
        }
        return -1;
    }
}