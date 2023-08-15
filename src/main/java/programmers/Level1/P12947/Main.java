package programmers.Level1.P12947;

// 하샤드 수
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(10));
        System.out.println(new Solution().solution(12));
        System.out.println(new Solution().solution(11));
        System.out.println(new Solution().solution(13));
    }
}

class Solution {
    public boolean solution(int x) {
        String[] str = String.valueOf(x).split("");
        int sum = 0;
        for (String s : str) sum += Integer.parseInt(s);
        return x % sum == 0;
    }
}