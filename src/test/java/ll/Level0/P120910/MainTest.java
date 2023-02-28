package ll.Level0.P120910;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    @DisplayName("2와 10을 입력하면 2048 출력")
    void t1() {
        assertThat(new Solution().solution(2, 10)).isEqualTo(2048);
    }

    @Test
    @DisplayName("7과 15를 입력하면 229,376 출력")
    void t2() {
        assertThat(new Solution().solution(7, 15)).isEqualTo(229376);
    }
}