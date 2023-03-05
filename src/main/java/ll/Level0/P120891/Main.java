package ll.Level0.P120891;
// 369 게임
public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int order) {
        int cnt = 0;
        for (char c : String.valueOf(order).toCharArray()){
            if (c == '3' || c == '6' || c == '9') cnt++;
        }
        return cnt;
    }
}