package programmers.Level0.P120897;

import java.util.ArrayList;

// 약수 구하기
public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i < n+1; i++){
            if (n % i == 0) arr.add(i);
        }
        return arr.stream().sorted().mapToInt(e -> e).toArray();
    }
}