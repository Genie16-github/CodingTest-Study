package programmers.Level0.P120902;
// 문자열 계산하기
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("3 + 4"));
    }
}

class Solution {
    public int solution(String my_string) {
        int answer;
        String[] arr = my_string.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("+")) {
                arr[i+1] = String.valueOf(Integer.parseInt(arr[i-1]) + Integer.parseInt(arr[i+1]));
            } else if (arr[i].equals("-")) {
                arr[i+1] = String.valueOf(Integer.parseInt(arr[i-1]) - Integer.parseInt(arr[i+1]));
            }
        }
        answer = Integer.parseInt(arr[arr.length-1]);
        return answer;
    }
}