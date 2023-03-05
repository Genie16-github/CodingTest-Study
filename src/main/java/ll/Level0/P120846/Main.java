package ll.Level0.P120846;
// 합성수 찾기
public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int n) {
        int ans = 0;
        for (int i = 4; i < n+1 ; i++){
            int cnt = 0;
            for (int j = 1; j < i+1; j++){
                if (i % j == 0) cnt++;
            }
            if (cnt > 2) ans++;
        }

        return ans;
    }
}