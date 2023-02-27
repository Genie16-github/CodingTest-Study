package ll.Level0.P120837;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    @DisplayName("23을 입력하면 5출력")
    void t1() {
        assertThat(new Solution().solution(23)).isEqualTo(5);
    }

    @Test
    @DisplayName("24를 입력하면 6출력")
    void t2() {
        assertThat(new Solution().solution(24)).isEqualTo(6);
    }

    @Test
    @DisplayName("999를 입력하면 201출력")
    void t3() {
        assertThat(new Solution().solution(999)).isEqualTo(201);
    }
}