package ll.Level0.P120815;
// 피자 나눠 먹기(2)
public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int n) {
        int num = 1;
        while ((6 * num) % n != 0) {
            num++;
        }
        return num;
    }
}