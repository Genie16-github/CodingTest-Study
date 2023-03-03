package ll.Level0.P120845;
// 주사위의 개수
public class Main {
    public static void main(String[] args) {
        new Solution().solution(new int[]{10, 8, 6}, 3);
    }
}

class Solution {
    public int solution(int[] box, int n) {
        int answer = box[0] / n;
        for (int i = 1 ; i < 3 ; i++){
            answer *= Math.floor((double)box[i] / n);
        }
        return answer;
    }

}