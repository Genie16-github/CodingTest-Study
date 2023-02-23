package ll.Level0.P120898;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class MainTest {

    @Test
    @DisplayName("I love you~ 를 입력 -> 22를 출력")
    void main() {
        assertThat(new Solution().solution("I love you~")).isEqualTo(22);
    }
}