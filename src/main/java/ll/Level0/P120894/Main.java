package ll.Level0.P120894;

import java.util.HashMap;
import java.util.Map;

// 영어가 싫어요
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("onetwothreefourfivesixseveneightnine"));
        System.out.println(new Solution().solution("onefourzerosixseven"));
    }
}

class Solution {
    public long solution(String numbers) {
        long answer;
        Map<String, String> dict = new HashMap<>(){{
            put("zero", "0");
            put("one", "1");
            put("two", "2");
            put("three", "3");
            put("four", "4");
            put("five", "5");
            put("six", "6");
            put("seven", "7");
            put("eight", "8");
            put("nine", "9");
        }};

        for (String key : dict.keySet()){
            numbers = numbers.replaceAll(key, dict.get(key));
        }

        answer = Long.parseLong(numbers);
        return answer;
    }
}