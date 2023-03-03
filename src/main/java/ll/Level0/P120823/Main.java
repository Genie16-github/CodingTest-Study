package ll.Level0.P120823;

import java.util.Scanner;
// 직각삼각형 출력하기

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0 ; i < n; i++){
            System.out.println("*".repeat(i+1));
        }
    }
}