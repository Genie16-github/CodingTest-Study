package ll.Level0.P120849;
// 모음 제거
public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public String solution(String my_string) {
        String vowels = "aeiou";
        for (char c : vowels.toCharArray()){
            my_string = my_string.replace(String.valueOf(c), "");
        }
        return my_string;
    }
}