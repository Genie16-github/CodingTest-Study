package ll.Level0.P120851;
// 숨어있는 숫자의 덧셈(1)

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for (char num : my_string.toCharArray()){
            if (Character.isDigit(num)){
                answer += Integer.parseInt(Character.toString(num));
            }
        }
        return answer;
    }
}