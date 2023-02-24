package ll.Level0.P120906;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    @DisplayName("1234 입력하면 각 자리 숫자 합 계산해서 10출력")
    void t1() {
        Assertions.assertThat(new Solution().solution(1234)).isEqualTo(10);
    }

    @Test
    @DisplayName("930211 입력하면 각 자리 숫자 합 계산해서 16출력")
    void t2() {
        Assertions.assertThat(new Solution().solution(930211)).isEqualTo(16);
    }
}