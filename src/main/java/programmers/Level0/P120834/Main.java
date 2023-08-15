package programmers.Level0.P120834;

// 외계행성의 나이
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(23));
    }
}

class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String[] arr = String.valueOf(age).split("");
        for (String s : arr) {
            sb.append((char)((Integer.parseInt(s) + 97)));
        }
        return sb.toString();
    }
}