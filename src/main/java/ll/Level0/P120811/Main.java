package ll.Level0.P120811;

import java.util.Arrays;

// 중앙값 구하기
public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }
}