package baekjoon.silver;

import java.util.*;
import java.io.*;

// 대칭 차집합 (실4)
public class P1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<Integer> aSet = new HashSet<>();
        HashSet<Integer> bSet = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            aSet.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            bSet.add(Integer.parseInt(st.nextToken()));
        }

        int sum = 0;
        for (int num : aSet) {
            if (!bSet.contains(num)) {
                sum += 1;
            }
        }

        for(int num : bSet) {
            if (!aSet.contains(num)) {
                sum += 1;
            }
        }

        System.out.println(sum);
    }
}
