package ll.Level0.P120906;
// 자릿수 더하기
public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n > 0){
            answer += n % 10;
            n = n / 10;
        }
        return answer;
    }
}