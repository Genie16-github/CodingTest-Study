package ll.Level0.P120905;

import java.util.ArrayList;

// n의 배수 고르기
public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int d : numlist){
            if (d % n == 0) answer.add(d);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}