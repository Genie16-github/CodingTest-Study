package ll.Level0.P120912;

import java.util.Arrays;

// 7의 개수
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{7, 77, 17}));
        System.out.println(new Solution().solution(new int[]{10, 29}));
    }
}

class Solution{
    public int solution(int[] array){
        int answer = 0;
        String str = Arrays.toString(array);
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '7'){
                answer++;
            }
        }
        return answer;
    }
}