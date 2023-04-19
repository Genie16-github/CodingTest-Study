package ll.Level0.P120883;
// 로그인 성공?
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(
                new String[]{"meosseugi", "1234"},
                new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}})
        );
        System.out.println(new Solution().solution(
                new String[]{"programmer01", "15789"},
                new String[][]{{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}})
        );
        System.out.println(new Solution().solution(
                new String[]{"rabbit04", "98761"},
                new String[][]{{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}})
        );
    }
}

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        for (String[] data : db) {
            if (data[0].equals(id_pw[0])) {
                if (!data[1].equals(id_pw[1])) return "wrong pw";
                return "login";
            }
        }
        return "fail";
    }
}