package ll.Level0.P120839;
// 가위 바위 보
public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        for(char c : rsp.toCharArray()){
            if (c == '2') sb.append("0");
            else if (c == '0') sb.append("5");
            else sb.append("2");
        }
        return sb.toString();
    }
}