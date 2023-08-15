package programmers.Level0.P120882;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// 등수 매기기
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(
                new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}})));
        System.out.println(Arrays.toString(new Solution().solution(
                new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}})));
    }
}

class Solution {
    public int[] solution(int[][] score) {
        List<Integer> scoreList = new ArrayList<>();
        for(int[] s : score){
            scoreList.add(s[0] + s[1]);
        }
        scoreList.sort(Comparator.reverseOrder());

        int[] answer = new int[score.length];
        for(int i=0; i<score.length; i++){
            answer[i] = scoreList.indexOf(score[i][0] + score[i][1])+1;
        }
        return answer;
//        return Arrays.stream(score)
//                .map(ints -> Arrays.stream(ints).average().orElse(0))
//                .mapToInt(d -> Arrays.stream(score).map(ints -> Arrays.stream(ints).average().orElse(0))
//                        .sorted(Comparator.reverseOrder())
//                        .collect(Collectors.toList())
//                        .indexOf(d) + 1)
//                .toArray();
    }
}