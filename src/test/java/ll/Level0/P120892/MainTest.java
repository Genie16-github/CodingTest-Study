package ll.Level0.P120892;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    @Test
    @DisplayName("\"dfjardstddetckdaccccdegk\"와 code \"4\"를 입력하면 \"attack\" 출력")
    void t1() {
        assertThat(new Solution().solution("dfjardstddetckdaccccdegk", 4))
                .isEqualTo("attack");
    }

    @Test
    @DisplayName("\"pfqallllabwaoclk\"와 code \"2\"를 입력하면 \"fallback\" 출력")
    void t2() {
        assertThat(new Solution().solution("pfqallllabwaoclk", 2))
                .isEqualTo("fallback");
    }
}