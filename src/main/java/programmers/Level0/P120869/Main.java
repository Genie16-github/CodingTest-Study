package programmers.Level0.P120869;
// 외계어 사전
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new String[]{"p", "o", "s"},
                new String[]{"sod", "eocd", "qixm", "adio", "soo"}));
        System.out.println(new Solution().solution(new String[]{"z", "d", "x"},
                new String[]{"def", "dww", "dzx", "loveaw"}));
        System.out.println(new Solution().solution(new String[]{"s", "o", "m", "d"},
                new String[]{"moos", "dzx", "smm", "sunmmo", "som"}));
    }
}

class Solution {
    public int solution(String[] spell, String[] dic) {
        for (String str : dic) {
            boolean chk = true;
            for (String sp : spell) {
                if (!str.contains(sp)) {
                    chk = false;
                    break;
                }
                str = str.replaceAll(sp, "");
            }
            if (chk && str.equals("")) return 1;
        }
        return 2;
    }
}