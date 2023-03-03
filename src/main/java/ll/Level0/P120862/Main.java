package ll.Level0.P120862;

import java.util.Arrays;

// 최댓값 만들기(2)
public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int num1 = numbers[0] * numbers[1];
        int num2 = numbers[numbers.length-1] * numbers[numbers.length-2];

        return Math.max(num1, num2);
    }
}