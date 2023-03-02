package ll.Level0.P120893;
// 대문자와 소문자
public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (char c : my_string.toCharArray()){
            if (Character.isLowerCase(c)) c = Character.toUpperCase(c);
            else c = Character.toLowerCase(c);
            sb.append(c);
        }
        return sb.toString();
    }
}