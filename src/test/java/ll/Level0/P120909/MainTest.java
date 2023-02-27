package ll.Level0.P120909;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    @DisplayName("144를 입력하면 제곱수이기 때문에 1출력")
    void t1() {
        assertThat(new Solution().solution(144)).isEqualTo(1);
    }

    @Test
    @DisplayName("976을 입력하면 제곱수가 아니기 때문에 2출력")
    void t2() {
        assertThat(new Solution().solution(976)).isEqualTo(2);
    }
}