package ll.Level1.P12944;
// 평균 구하기
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 2, 3, 4}));
        System.out.println(new Solution().solution(new int[]{5, 5}));
    }
}

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for (int i : arr) answer += i;
        return answer / arr.length;
    }
}