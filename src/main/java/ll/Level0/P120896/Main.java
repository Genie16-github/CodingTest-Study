package ll.Level0.P120896;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("abcabcadc"));
    }
}

class Solution {
    public String solution(String s) {
        char[] alpha = new char[26];
        for (int i = 0; i < s.length(); i++) {
            alpha[s.charAt(i) - 97]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] == 1) sb.append((char) (i + 97));
        }

        return sb.toString();
    }
}
