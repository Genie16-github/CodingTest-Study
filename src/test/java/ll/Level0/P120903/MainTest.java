package ll.Level0.P120903;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class MainTest {
    @Test
    @DisplayName(" [a, b, c]와 [com, b, d, p, c] 입력 -> 결과 2 출력")
    void t1(){
        assertThat(new Solution().solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"})).isEqualTo(2);
    }

    @Test
    @DisplayName(" [n, omg]와 [m, dot] 입력 -> 결과 0 출력")
    void t2(){
        assertThat(new Solution().solution(new String[]{"n", "omg"}, new String[]{"m", "dot"})).isEqualTo(0);
    }
}