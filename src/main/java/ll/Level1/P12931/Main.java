package ll.Level1.P12931;
// 자릿수 더하기
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(123));
        System.out.println(new Solution().solution(987));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        char[] chars = String.valueOf(n).toCharArray();
        for (char c : chars){
            answer += Integer.parseInt(String.valueOf(c));
        }
        return answer;
    }
}