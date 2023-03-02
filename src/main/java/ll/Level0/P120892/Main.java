package ll.Level0.P120892;
// 암호 해독
public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        char[] data = cipher.toCharArray();
        for (int i = code; i < data.length + 1; i+=code){
            sb.append(data[i-1]);
        }
        return sb.toString();
    }
}