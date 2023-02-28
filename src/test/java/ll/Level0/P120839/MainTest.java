package ll.Level0.P120839;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    @DisplayName("2를 입력하면 0을 출력")
    void t1() {
        assertThat(new Solution().solution("2")).isEqualTo("0");
    }

    @Test
    @DisplayName("205를 입력하면 052를 출력")
    void t2() {
        assertThat(new Solution().solution("205")).isEqualTo("052");
    }
}