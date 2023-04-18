package ll.Level0.P120853;

// 컨트롤 제트
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("1 2 Z 3"));
    }
}

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Z")) {
                answer -= Integer.parseInt(arr[i-1]);
                continue;
            }
            answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
}