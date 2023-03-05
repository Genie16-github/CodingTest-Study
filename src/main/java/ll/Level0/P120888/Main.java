package ll.Level0.P120888;
// 중복된 문자 제거
public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public String solution(String my_string) {
        String res = "";
        for (int i = 0; i < my_string.length(); i++){
            if (my_string.indexOf(my_string.charAt(i)) == i) res += my_string.charAt(i);
        }

        return res;
    }
}
