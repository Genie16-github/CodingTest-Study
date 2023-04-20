package ll.Level0.P120863;

// 다항식 더하기
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("3x + 7 + x"));
        System.out.println(new Solution().solution("x + x + x"));
    }
}

class Solution {
    public String solution(String polynomial) {
        String answer;
        int coe = 0;
        int con = 0;
        String[] degree = polynomial.split(" \\+ ");
        for (String d : degree) {
            if (d.equals("x")) coe++;
            else if (d.contains("x")) {
                d = d.substring(0, d.length()-1);
                coe += Integer.parseInt(d);
            }
            else {
                con += Integer.parseInt(d);
            }
        }
        if (con !=  0) {
            if (coe == 1) answer = "x + " + con;
            else if(coe == 0) answer = "" + con;
            else answer = coe + "x + " + con;
        } else {
            if (coe == 1) answer = "x";
            else answer = coe + "x";
        }

        return answer;
    }
}