package ll.Level0.P120956;

import java.util.ArrayList;
import java.util.List;

// 옹알이(1)
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(
                new String[]{"aya", "yee", "u", "maa", "wyeoo"}
        ));
        System.out.println(new Solution().solution(
                new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}
        ));
    }
}

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        List<String> list = new ArrayList<>(){
            {
                add("aya");
                add("ye");
                add("woo");
                add("ma");
            }
        };

        for (int i = 0; i < babbling.length; i++){
            for (String s : list){
                babbling[i] = babbling[i].replaceFirst(s, "*");
            }
            babbling[i] = babbling[i].replace("*", "");
        }

        for (String s : babbling){
            if (s.equals("")) answer++;
        }
        return answer;
    }
}