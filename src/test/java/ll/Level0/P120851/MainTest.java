package ll.Level0.P120851;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Aabb123cc45를 입력하면 숫자들의 합 15를 출력")
    void t1() {
        Assertions.assertThat(new Solution().solution("Aabb123cc45")).isEqualTo(15);
    }
}