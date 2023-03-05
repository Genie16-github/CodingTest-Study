package ll.Level0.P120904;
// 숫자 찾기
public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int num, int k) {
        char[] tmp = String.valueOf(num).toCharArray();
        int idx = -1;
        for (int i = 0; i < tmp.length; i++){
            if (Integer.parseInt(String.valueOf(tmp[i])) == k){
                idx = i+1;
                break;
            }
        }
        return idx;
    }
}
