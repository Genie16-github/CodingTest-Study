package ll.Level0.P120898;
// 편지

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("happy birthday!"));
    }
}

class Solution {
    public int solution(String message) {
        return (message.length() * 2);
    }
}