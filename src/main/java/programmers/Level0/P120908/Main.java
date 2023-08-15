package programmers.Level0.P120908;
// 문자열안에 문자열
public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(String str1, String str2) {
        String tmp = str1.replace(str2, "");
        if(tmp.equals(str1)) return 2;
        return 1;
    }
}