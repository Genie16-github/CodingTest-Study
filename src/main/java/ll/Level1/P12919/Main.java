package ll.Level1.P12919;
// 서울에서 김서방 찾기
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(
                new String[]{"Jane", "Kim"}
        ));
    }
}

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) answer = "김서방은 " + i + "에 있다";
        }
        return answer;
    }
}