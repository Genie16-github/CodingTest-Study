package ll.Level0.P120913;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 잘라서 배열로 저장하기
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution("abc1Addfggg4556b", 6)));
        System.out.println(Arrays.toString(new Solution().solution("abcdef123", 3)));
    }
}

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < (my_str.length() / n); i++) {
            answer.add(my_str.substring((n * i), (n * (i + 1))));
        }
        if (my_str.length() % n != 0) {
            answer.add(my_str.substring( (my_str.length() / n) * n));
        }
        return answer.toArray(new String[0]);
    }
}