package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 나는야 포켓몬 마스터 이다솜 (실4)
public class P1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 양방향 접근을 위해 map 2개 필요
        Map<Integer, String> numToName = new HashMap<>();
        Map<String, Integer> nameToNum = new HashMap<>();
        for (int i = 1; i < N+1; i++) {
            String name = br.readLine();
            numToName.put(i, name);
            nameToNum.put(name, i);
        }

        for (int i = 0; i < M; i++) {
            String str = br.readLine();

            // 문자가 숫자인지, 알파벳인지 확인
            if (Character.isDigit(str.charAt(0))) {
                System.out.println(numToName.get(Integer.parseInt(str)));
            }
            else {
                System.out.println(nameToNum.get(str));
            }
        }
    }
}
