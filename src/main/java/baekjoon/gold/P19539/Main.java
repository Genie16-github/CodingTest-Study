package baekjoon.gold.P19539;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = 0;
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			cnt += tmp / 2;
			sum += tmp;
		}

		if(sum % 3 != 0) {
			System.out.println("NO");
		} else {
			sum = sum / 3;
			if (cnt >= sum)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
