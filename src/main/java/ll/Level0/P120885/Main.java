package ll.Level0.P120885;
// 이진수 더하기
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("10", "11"));
    }
}

class Solution {
    public String solution(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1,2)+Integer.parseInt(bin2,2));
    }
}