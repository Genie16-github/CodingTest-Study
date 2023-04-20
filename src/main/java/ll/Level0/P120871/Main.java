package ll.Level0.P120871;
// 저주의 숫자3
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(15));
        System.out.println(new Solution().solution(40));
    }
}

class Solution {
    public int solution(int n) {
        int answer = n;
        int i = 1;
        while (i <= answer) {
            if ((i % 3 == 0) || String.valueOf(i).contains("3")) {
                answer++;
            }
            i++;
        }
        return answer;
    }
}