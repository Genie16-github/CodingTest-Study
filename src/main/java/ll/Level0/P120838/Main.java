package ll.Level0.P120838;

import java.util.HashMap;
import java.util.Map;

// 모스부호(1)
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(".... . .-.. .-.. ---"));
    }
}

class Solution {
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        Map<String, String> code = new HashMap<>();
        code.put(".-", "a");
        code.put("-...", "b");
        code.put("-.-.", "c");
        code.put("-..", "d");
        code.put(".", "e");
        code.put("..-.", "f");
        code.put("--.", "g");
        code.put("....", "h");
        code.put("..", "i");
        code.put(".---", "j");
        code.put("-.-", "k");
        code.put(".-..", "l");
        code.put("--", "m");
        code.put("-.", "n");
        code.put("---", "o");
        code.put(".--.", "p");
        code.put("--.-", "q");
        code.put(".-.", "r");
        code.put("...", "s");
        code.put("-", "t");
        code.put("..-", "u");
        code.put("...-", "v");
        code.put(".--", "w");
        code.put("-..-", "x");
        code.put("-.--", "y");
        code.put("--..", "z");

        for (String arr : letter.split(" ")){
            sb.append(code.get(arr));
        }

        return sb.toString();
    }
}