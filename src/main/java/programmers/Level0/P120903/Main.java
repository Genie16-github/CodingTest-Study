package programmers.Level0.P120903;

// 배열의 유사도
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String str1 : s1){
            for(String str2 : s2){
                if (Objects.equals(str1, str2)) answer++;
            }
        }
        return answer;
    }
}