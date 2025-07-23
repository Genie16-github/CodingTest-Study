package baekjoon.silver;

import java.util.*;
import java.io.*;

// 도키도키 간식 드리미 (실3)
public class P12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int idx = 1;
        String res = "Nice";
        String[] nums = br.readLine().split(" ");
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < N; i++){
            int currentNum = Integer.parseInt(nums[i]);
            if(idx != currentNum){
                if(!stack.isEmpty() && idx == stack.peek()){
                    idx++;
                    i--;
                    stack.pop();
                } else {
                    stack.push(currentNum);
                }
            } else {
                idx++;
            }
        }

        // 대기줄에 있는 사람 처리
        while(!stack.isEmpty()){
            int pop = stack.pop();
            if(pop == idx){
                idx++;
            } else {
                res = "Sad";
                break;
            }
        }
        System.out.println(res);
    }
}
