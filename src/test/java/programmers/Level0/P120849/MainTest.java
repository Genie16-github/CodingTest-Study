package programmers.Level0.P120849;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("bus를 입력하면 모음 u가 제거되고 bs 출력")
    void t1() {
        Assertions.assertThat(new Solution().solution("bus")).isEqualTo("bs");
    }

    @Test
    @DisplayName("nice to meet you 를 입력하면 모음이 제거되고 nc t mt y 출력")
    void t2() {
        Assertions.assertThat(new Solution().solution("nice to meet you")).isEqualTo("nc t mt y");
    }
}