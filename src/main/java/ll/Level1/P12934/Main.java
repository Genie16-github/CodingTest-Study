package ll.Level1.P12934;
// 정수 제곱근 판별
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(121));
        System.out.println(new Solution().solution(3));
    }
}

class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);

        if(sqrt == (int) sqrt){
            return (long)Math.pow(sqrt + 1, 2);
        } else return -1;
    }
}