package ll.Level0.P120850;

import java.util.ArrayList;

// 문자열 정렬하기(1)
public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (char c : my_string.toCharArray()){
            if (Character.isDigit(c)) nums.add(Integer.parseInt(Character.toString(c)));
        }
        return nums.stream().sorted().mapToInt(i -> i).toArray();
    }
}