package programmers.Level0.P120921;
// 문자열 밀기
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("hello", "ohell"));
        System.out.println(new Solution().solution("hello", "lohel"));
        System.out.println(new Solution().solution("apple", "elppa"));
        System.out.println(new Solution().solution("atat", "tata"));
        System.out.println(new Solution().solution("abc", "abc"));
    }
}

class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        if (A.equals(B)) return answer;
        for (int i = 1; i < A.length(); i++) {
            A = A.charAt(A.length()-1) + A.substring(0, A.length()-1);
            answer++;
            if (A.equals(B)) return answer;
        }
        return -1;
//        String tempB = B.repeat(2);
//        return tempB.indexOf(A);
    }
}