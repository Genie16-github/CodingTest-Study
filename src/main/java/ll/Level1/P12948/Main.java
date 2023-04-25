package ll.Level1.P12948;
// 핸드폰 번호 가리기
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("01033334444"));
        System.out.println(new Solution().solution("027778888"));
    }
}

class Solution {
    public String solution(String phone_number) {
        return "*".repeat(phone_number.length()-4) + phone_number.substring(phone_number.length()-4);
    }
}