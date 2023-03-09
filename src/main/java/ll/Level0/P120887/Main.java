package ll.Level0.P120887;
// k의 개수
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(1, 13, 1));
    }
}

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int q = i; q < j+1; q++){
            String str = Integer.toString(q);

            for (int p = 0; p < str.length(); p++){
                if (Integer.toString(k).equals(str.substring(p, p+1))){
                    answer++;
                }
            }
        }
        return answer;
    }
}