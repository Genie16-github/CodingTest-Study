package programmers.Level0.P120813;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("10을 입력 -> [1, 3, 5, 7, 9] 출력")
    void t1() {
        assertThat(new Solution().solution(10)).isEqualTo(new int[]{1, 3, 5, 7, 9});
    }

    @Test
    @DisplayName("15를 입력 -> [1, 3, 5, 7, 9, 11, 13, 15] 출력")
    void t2() {
        assertThat(new Solution().solution(15)).isEqualTo(new int[]{1, 3, 5, 7, 9, 11, 13, 15});
    }
}